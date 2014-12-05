package concurrency.example1;

public class SimpleThreads {

	// Display a message, preceded by
	// the name of the current thread
	static void threadMessage(String message,Long time) {
		String threadName = Thread.currentThread().getName();
		//System.out.format("%s: %s %n", threadName, message,time);
		System.out.println(threadName+":"+message+" time:"+time/1000);
	}

	private static class MessageLoop implements Runnable {
		public void run() {
			String importantInfo[] = { "Mares eat oats", "Does eat oats",
					"Little lambs eat ivy", "A kid will eat ivy too" };
			try {
				for (int i = 0; i < importantInfo.length; i++) {
					// Pause for 4 seconds
					Thread.sleep(4000);
					// Print a message
					threadMessage(importantInfo[i],0L);
				}
			} catch (InterruptedException e) {
				threadMessage("I wasn't done!",0L);
			}
		}
	}

	public static void main(String args[]) throws InterruptedException {

		// Delay, in milliseconds before
		// we interrupt MessageLoop
		// thread (default one hour).
		long patience = 1000 * 10;

		// If command line argument
		// present, gives patience
		// in seconds.
		if (args.length > 0) {
			try {
				patience = Long.parseLong(args[0]) * 1000;
			} catch (NumberFormatException e) {
				System.err.println("Argument must be an integer.");
				System.exit(1);
			}
		}

		threadMessage("Starting MessageLoop thread",new Long(0));
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();

		threadMessage("Waiting for MessageLoop thread to finish",new Long(0));
		// loop until MessageLoop
		// thread exits
		while (t.isAlive()) {
			threadMessage("Still waiting...",System.currentTimeMillis() - startTime);
			// Wait maximum of 1 second
			// for MessageLoop thread
			// to finish.
			t.join(1000);
			if (((System.currentTimeMillis() - startTime) > patience)
					&& t.isAlive()) {
				threadMessage("Tired of waiting!",System.currentTimeMillis() - startTime);
				t.interrupt();
				// Shouldn't be long now
				// -- wait indefinitely
				t.join();
			}
		}
		threadMessage("Finally!",System.currentTimeMillis() - startTime);
	}
}
