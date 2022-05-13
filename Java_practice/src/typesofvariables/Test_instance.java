package typesofvariables;

/*
 * Deceleration: inside a class body, but outside method.
 * Memory allocation: after Object is created
 * Default Value: YES
 * Scope: with in the class
 */

public class Test_instance {
	
	int a = 10; // instance/ non-static variable
	int b =20;
    //String name= "Aman";
	
	public static void main(String[] args) {
		
		Test_instance t1= new Test_instance();
		Test_instance t2= new Test_instance();
		
		System.out.println(t2.a);  //10
		System.out.println(t1.a);  //10
		
		t2.a=30;   //overriding value, updating value
		System.out.println(t1.a);  //10
		System.out.println(t2.a);   //30
		
		
		//Instance variables are private property of each and every object.  (object specific)
		//one obj is doing any changes to his variable, it will not effect for other object.
		
		//default value:
		
		
		
		
		
		
		
		
		
		
	}

}
