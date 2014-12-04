package pi.calculation.multithreading;

public class PiCalculator {

	private int pointsInSquare;
	private int pointsInCircle;

	public PiCalculator(int pointsInSquare) {
		super();
		this.pointsInSquare = pointsInSquare;
	}

	public synchronized void addToPointsInCircle(int pointsCount) {
		this.pointsInCircle += pointsCount;
	}

	public synchronized int getPointsInCircle() {
		return this.pointsInCircle;
	}

	public synchronized void setPointsInSquare(int pointsInSquare) {
		this.pointsInSquare = pointsInSquare;
	}

	public synchronized int getPointsInSquare() {
		return this.pointsInSquare;
	}

}
