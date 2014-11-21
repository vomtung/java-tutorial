package concurrency.memoryconsistency;

public class MemoryConsistency {

	public static void main(String[] args) {
		Counter counter=new Counter();
		SimpleThread thread1=new SimpleThread(counter);
		SimpleThread thread2=new SimpleThread(counter);
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
		System.out.println(counter.getC());
	}
}
