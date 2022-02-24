package cando;

public class CollegeConstructor {

	int a;
	String b;
	CollegeConstructor(){ }
		// Default constructor --> College(){ --- }  /* here obj need to be created in main,College() this is constructor
	   // here we can use public,private,protected, now it is default like public College(){ --- } // op will be 0 null
	
	CollegeConstructor(int c, String d){   // parameterized constructor// here values are added
		a=c;
		b=d;      
	}
	
	public static void main(String[] args) {
	//	CollegeConstructor c = new CollegeConstructor();  // College() is constructor his is default
		
		CollegeConstructor c = new CollegeConstructor(45," sun");  // College() we will pass values  // this is parameterized
		CollegeConstructor c1 = new CollegeConstructor(50," Sunny");  // anotherr constructor and passing value
		
		System.out.println(c.a+c.b );
		System.out.println(c1.a+c1.b );

	}

}
