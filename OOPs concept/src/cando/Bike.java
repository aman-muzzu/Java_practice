package cando;

// what all we used in this, static variabe, instance variable, static method, non static method

public class Bike {

	static int Wheels=2; // all bikes wil have 2 wheels so will use static variable
	String color="";     // object to object will change then use instance variable
	
	// Method creating
	// static method for all bikes if breaking is appled we use static method
	static void Breaking() {
		System.out.println("Bike halts if breaks is applied");
	}
	
	// non static method,/instance method we have different values we have to intilize value like Mileage(int s)
	void Mileage(int s) {
		System.out.println("Mileage is "+ s +" Kmph");
	}
	
	public static void main(String[] args) {
		//In class we ca use main methods,constructors,blocks,nestedclass,interface
		Bike RE = new Bike();  // created 3 object RE,R15,RX100
		Bike R15= new Bike();
		Bike RX100= new Bike();
		System.out.println("No.of wheels"+Bike.Wheels); // op will be 2 (using . operator wecan call static variable)
		
		R15.color="Red";  //op will be color red(using . operator we can call non static variable)
		System.out.println("R15 coolr is "+R15.color);
		 
		// calling static method breaking in main method
		RX100.Breaking();
		RE.Breaking();
		
		// calling non static method mealiage
		
		RE.Mileage(35);

	} 

}
