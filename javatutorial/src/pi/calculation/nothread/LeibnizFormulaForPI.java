package pi.calculation.nothread;

import java.util.Scanner;

public class LeibnizFormulaForPI {

	/*
	 * this is Leibniz formula for PI
	 * read more at http://en.wikipedia.org/wiki/Leibniz_formula_for_%CF%80
	 * PI/4=1-1/3+1/5-1/7+....
	 */
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter input
		System.out.println("Enter number of terms");
		double SomeNumber = input.nextDouble(); // value of i user entered
		System.out.println("i="+SomeNumber);
		double sum = 0;
		for(double i=0; i<=SomeNumber; i++)
		{
			if (i % 2 == 0) { // if the remainder of `i/2` is 0
				sum += 1 / (2 * i + 1);
			} else {
				sum += -1 / (2 * i + 1);
			}
		    System.out.println("loop:"+i+",result:"+sum);
		}
		System.out.println("PI="+sum*4);
	}

}
