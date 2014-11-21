package concurrency.memoryconsistency;

public class SimpleThread extends Thread{

	Counter counter;
	
	public SimpleThread(Counter counter) {
		super();
		this.counter = counter;
	}

	public void run() {
		System.out.println("Hello from "+this.getName());
		for (int i = 0; i < 2000; i++) {
			this.counter.increment();
		}
	}
	
}
