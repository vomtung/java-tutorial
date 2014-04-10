package countNumberObject;

public class MyClass {
	static int numberObjectCreate=0;
	/**
	 * @param args
	 */
	public MyClass(){
		numberObjectCreate++;
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myObject1=new MyClass();
		MyClass myObject2=new MyClass();
		MyClass myObject3=new MyClass();
		MyClass myObject4=new MyClass();
		MyClass myObject5=new MyClass();
		System.out.println("Number object created:"+myObject1.numberObjectCreate);
		System.out.println("Number object created:"+myObject2.numberObjectCreate);
		System.out.println("Number object created:"+myObject3.numberObjectCreate);
		System.out.println("Number object created:"+myObject4.numberObjectCreate);
		System.out.println("Number object created:"+myObject5.numberObjectCreate);
	}

}
