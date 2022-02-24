package cando;

public class Localvariable {

	//local variabe
	 //1. delcleration--block/method/cunstractor
	// 2.scope-- access only with in the block
	// 3.initilization- initilization is mandatory
	// 4.access specifier- no
	 //5.allocation- created when block is enteredor function is clled and destroyed afetr endtering
	
	void myname() {
		String a="ANJUMUZZU";
		System.out.println("My name is "+ a);
	}  // end of fun--deallocating memory
	
	public static void main(String[] args) {
		Localvariable obj = new Localvariable();
		
		obj.myname(); // method calling --memory allocates
		
		
	}

}
