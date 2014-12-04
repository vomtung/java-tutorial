package comparevalueandobject;

public class CompareString {

	public static void main(String[] args) {
		// These two have the same value
		System.out.println("new String(\"test\").equals(\"test\"):"+new String("test").equals("test")); // --> true 

		// ... but they are not the same object
		System.out.println("new String(\"test\") == \"test\":"+(new String("test") == "test")); // --> false 

		// ... neither are these
		System.out.println("new String(\"test\") == new String(\"test\"):"+(new String("test") == new String("test"))); // --> false 

		// ... but these are because literals are interned by 
		// the compiler and thus refer to the same object
		System.out.println("\"test\" == \"test\":"+("test" == "test")); // --> true

		// concatenation of string literals happens at compile time,
		// also resulting in the same object
		System.out.println("\"test\" == \"te\" + \"st\":"+("test" == "te" + "st")); // --> true

		// but .substring() is invoked at runtime, generating distinct objects
		System.out.println("\"test\" == \"!test\".substring(1)"+("test" == "!test".substring(1))); // --> false

		// interned strings can also be recalled by calling .intern()
		System.out.println("\"test\" == \"!test\".substring(1).intern():"+("test" == "!test".substring(1).intern())); // --> true
	}

}
