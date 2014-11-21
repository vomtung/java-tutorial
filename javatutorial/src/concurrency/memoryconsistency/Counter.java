package concurrency.memoryconsistency;

public class Counter {

	static private int c = 0;

	public void increment() {
		c++;
	}

	public void decrement() {
		c--;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

}
