package typesofvariables;
/*
 * Deceleration: inside a Method body
 * Memory allocation: after Method is called
 * Default Value: No   
 * Scope: Limited access
 */

public class Test_Local {
	
	       int a= 100;    //instance
	static int b= 200;  //static

	public static void main(String[] args) {
		
		int var= 500;  //local
	    int a=50;     //local
	    
	    System.out.println(a);  //50// As local declared so called directly.
	    
	    Test_Local obj = new Test_Local();
	    System.out.println(obj.a);   // 100// created object and called so value of instance is printed
		
	    // preference--priority is give for local variable.
	    // we need to assign value compulsory in local variable, or else you will get compile time error
	    
	    //scope
	     int ab=100;
	    int xyz=0;   //local
	    if (var==100) {  
	    	xyz=700;  //local    //int xyz= 700   you will get error as below
	    }
	    System.out.println(xyz); //getting compile time error// in order to over come yu will add (int xyz=0;) linw 29
	    
	    

	}

}
