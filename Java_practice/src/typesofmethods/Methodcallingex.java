package typesofmethods;

/*
 *1) When you are calling a Static property------->always use class name
 *2) When you are calling a non-static property--->always use object
 */

public class Methodcallingex {
	
	int a= 30;               // instance
	static int b=50;         // static
	

	public static void main(String[] args) {
		
		System.out.println(Methodcallingex.b);  // call by class if static , here b=50 is static
		
		System.out.println(new Methodcallingex().a);  // call by object if instance, here a=30 is instance
		
		// we can also create object and call that variable like below.
		
		Methodcallingex obj = new Methodcallingex();
		//System.out.println(obj.a);                //30
		 int t =obj.a;		
		 System.out.println(t);                      //30
		

	}
	
	// now my concern is to call static method in non-static -add method ---> call by class name
	
	public void add() {
		Methodcallingex.sub();  // calling by class name
	
		// now my concern is to call non-static method in non-static -add method ---> call by object
		
		new Methodcallingex().mul(); // calling by object
	}
	
	public static void sub() {
		
	}
	
    public void mul() {
		
	}

}
