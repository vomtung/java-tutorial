/**
 *the interface have same method signature
 */
package inheritancemultiinterface;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Inside method 1");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myclass=new MyClass();
		myclass.method1();
	}

}
