package pi.calculation.multithreading;

public class TaskManager {

	public static void main(String[] args) {

		int threadsCount = 3;
		int size = 10000000;
		boolean isQuiet = false;

		PiCalculator pi = new PiCalculator(size);
		Thread tr[] = new Thread[threadsCount];

		long time = -System.currentTimeMillis();

		int i;
		double s = 1.0 / threadsCount;
		int p = size / threadsCount;

		for (i = 0; i < threadsCount; i++) {
			PiRunnable r = new PiRunnable(pi, s * i, s * (1.0 + i), p, isQuiet);
			tr[i] = new Thread(r);
		}

		for (i = 0; i < threadsCount; i++) {
			tr[i].start();
		}

		for (i = 0; i < threadsCount; i++) {
			try {
				tr[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		double myPi = 4.0 * pi.getPointsInCircle() / pi.getPointsInSquare();
		System.out.println(myPi + " time = "
				+ (System.currentTimeMillis() + time));
	}
}