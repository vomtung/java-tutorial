package concurrency.example1;

public class SleepMessages {

	public static void main(String args[]){
		String importantInfo[] = { "Mares eat oats", "Does eat oats",
				"Little lambs eat ivy", "A kid will eat ivy too" };

		try {

			for (int i = 0; i < importantInfo.length; i++) {
				// Pause for 4 seconds
				Thread.sleep(1000);
				System.out.println(1);
				Thread.sleep(1000);
				System.out.println(2);
				Thread.sleep(1000);
				System.out.println(3);
				// Print a message
				System.out.println(importantInfo[i]);
			}
		} catch (InterruptedException e) {
			System.out.println("this thread interupt");
		}
	}

}
