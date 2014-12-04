package pi.calculation.multithreading;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LeibnizFormulaForPI {

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter n:");
		double n= input.nextDouble();
		
		// Prompt the user to enter input
		System.out.println("Enter number of threads:");
		double numberofThread= input.nextDouble();
		
		double sum = 0;
		List <PiRunnable> piRunnableList=new LinkedList<PiRunnable>();
		Long start=System.currentTimeMillis();
		ExecutorService es = Executors.newCachedThreadPool();
		for(double i=0; i<numberofThread; i++)
		{
			PiRunnable pr= new PiRunnable(i,numberofThread,n);
			es.execute(pr);
			piRunnableList.add(pr);
		}
		es.shutdown();
		es.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);
		
		for(PiRunnable pr:piRunnableList){
			sum =sum+pr.getResult();
		}
		
		
		
		System.out.println("PI="+sum*4+"  time:"+(System.currentTimeMillis()-start)/1000+"s");
	}
}