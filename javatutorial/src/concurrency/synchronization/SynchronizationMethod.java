package concurrency.synchronization;

class PrintDemoSync {
	public synchronized  void printCount() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Counter   ---   " + i);
			}
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
		}
	}

}

class ThreadDemoSync extends Thread {
	
	private String threadName;
	
	PrintDemoSync PD;

	ThreadDemoSync(String name, PrintDemoSync pd) {
		threadName = name;
		PD = pd;
	}

	public void run() {
//		synchronized (PD) {
			PD.printCount();
//		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	/*public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}*/

}

public class SynchronizationMethod {
	public static void main(String args[]) {

		PrintDemoSync PD = new PrintDemoSync();

		ThreadDemoSync T1 = new ThreadDemoSync("Thread - 1 ", PD);
		ThreadDemoSync T2 = new ThreadDemoSync("Thread - 2 ", PD);

		T1.start();
		T2.start();

		// wait for threads to end
		try {
			T1.join();
			T2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}
