package comparevalueandobject.compareinteger;

public class CompareInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i1 = 127;
		Integer i2 = 127;
		Integer i3 = 128;
		Integer i4 = 128;

		System.out.println("i1==i2:"+(i1==i2));
		
		System.out.println("i4==i3"+(i3==i4));
		
		System.out.println("i1==i2:"+(i1.equals(i2)));
		
		System.out.println("i4==i3"+(i3.equals(i4)));
	}

}
