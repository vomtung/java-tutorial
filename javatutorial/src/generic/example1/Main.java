package generic.example1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void printextend(List<? extends Employer> list) {
	    double s = 0.0;
	    System.out.println(list);
	}
	
	public static void printsuper(List<? super Manager> list) {
	    double s = 0.0;
	    System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Manager>listManager=new ArrayList<Manager>();
		List<Employer>listEmployer=new ArrayList<Employer>();
		listManager.add(new Manager(2L));
		listManager.add(new Manager(1L));
		listManager.add(new Manager(3L));
		listEmployer.add(new Employer(1L));
		listEmployer.add(new Employer(2L));
		listEmployer.add(new Employer(3L));
		Main.printextend(listManager);
		Main.printextend(listEmployer);
		Main.printsuper(listManager);
		Main.printsuper(listEmployer);
	}
}
