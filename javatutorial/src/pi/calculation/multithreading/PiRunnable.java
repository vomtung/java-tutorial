package pi.calculation.multithreading;

public class PiRunnable implements Runnable {

	PiCalculator pi;
	private double minX;
	private double maxX;
	private int pointsToSpread;

	public PiRunnable(PiCalculator pi, double minX, double maxX,int pointsToSpread, boolean isQuiet) {
		super();
		this.pi = pi;
		this.minX = minX;
		this.maxX = maxX;
		this.pointsToSpread = pointsToSpread;
	}

	@Override
	public void run() {
		int n = countPointsInAreaInCircle(minX, maxX, pointsToSpread);
		pi.addToPointsInCircle(n);
	}

	public int countPointsInAreaInCircle(double minX, double maxX,
			int pointsCount) {
		double x;
		double y;

		int inCircle = 0;

		for (int i = 0; i < pointsCount; i++) {
			x = Math.random() * (maxX - minX) + minX;
			y = Math.random();

			if (x * x + y * y <= 1) {
				inCircle++;
			}
		}

		return inCircle;

	}

}