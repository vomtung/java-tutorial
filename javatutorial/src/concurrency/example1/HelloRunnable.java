package concurrency.example1;

public class HelloRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println("Hello from a thread!");
	}

	public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
    }
	
}
