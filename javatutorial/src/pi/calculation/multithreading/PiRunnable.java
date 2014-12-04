package pi.calculation.multithreading;

public class PiRunnable implements Runnable {

	private Double result=0.0;
	private Double nStartNumber;
	private Double numberOfThreads;
	private Double n;

	public PiRunnable(Double nStartNumber, Double numberOfThreads,Double n) {
		super();
		this.nStartNumber = nStartNumber;
		this.numberOfThreads = numberOfThreads;
		this.n=n;
	}

	@Override
	public void run() {
	this.result=0.0;
		for(Double i=nStartNumber;i<=n;i=i+numberOfThreads){
			this.result =this.result+Math.pow(-1, i)/(2*i+1);
		}
	
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	public Double getnStartNumber() {
		return nStartNumber;
	}

	public void setnStartNumber(Double nStartNumber) {
		this.nStartNumber = nStartNumber;
	}

	public Double getNumberOfThreads() {
		return numberOfThreads;
	}

	public void setNumberOfThreads(Double numberOfThreads) {
		this.numberOfThreads = numberOfThreads;
	}

	public Double getN() {
		return n;
	}

	public void setN(Double n) {
		this.n = n;
	}

}