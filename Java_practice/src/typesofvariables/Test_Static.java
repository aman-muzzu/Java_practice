package typesofvariables;
/*
 * Deceleration: inside a class body, but outside method. with static keyword
 * Memory allocation: after class loading
 * Default Value: YES   (same like instance)
 * Scope: with in the class
 */

public class Test_Static {
	
	       int a=100;  // instance
	static int b=200;  // static  (added static keyword)
	static String s="Aman";//  static (added static keyword)
	
	// Static variable is not object specific
	// instance variable is object specific

	public static void main(String[] args) {
		
		// calling directly with out object creation because it is static    
		b=100;     
		System.out.println(b=200);   // 200
		
		
		// if you wan to call non static variable in static method then you need to create object and call.
		Test_Static obj = new Test_Static();
		 int t=obj.a;
		 System.out.println(t);    //100
		 System.out.println(new Test_Static().a);  //100  directly creating object and printing
		
		/*Test_Static obj = new Test_Static();
		 * System.out.println(new Test_Static().a);
		 * BOTH ARE SAME
		 */

	}

}
