package comparevalueandobject.comparelong;

public class CompareLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long num1 = 127L;
		Long num2 = 127L;
		Long num3 = 128L;
		Long num4 = 128L;
		
		/* operator == compare object 
		 * value <= 127 is cached in to one object
		 * so num1 and num2 reference to the same object
		 * therefore, result is true
		 */
		System.out.println("num1==num2:"+(num1==num2));
		
		/* operator == compare object 
		 * value > 127 is not cached in to one object
		 * so num1 and num2 reference to the two different object
		 * therefore, result is false
		 */
		System.out.println("num1==num2:"+(num3==num4));
		
		/* equals compare value of object 
		 * therefore, result is true
		 */
		System.out.println("num1==num2:"+(num1.equals(num2)));
		
		/* equals compare value of object 
		 * therefore, result is true
		 */
		System.out.println("num3==num4:"+(num3.equals(num4)));
	}

}
