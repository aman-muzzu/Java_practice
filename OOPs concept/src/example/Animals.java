package example;

public class Animals {
	
	static int legs= 4;  // static variable
	String color="";    // instance/nonstatic variable

	static void Herbs() {                      // static method
		System.out.println("Herbevours animal");
	
	}
	void carn(int s, String c) {              //nonstatic or instance method used for carn
		
		
		System.out.println("tiger has "+ s + " legs and " + c );
	}
	void herb(int i, String h) {              //nonstatic or instance method used for herb
		
		
		System.out.println("Sheep has "+ i + " legs and " + h );
	}
	public static void main(String[] args) {
		
		Animals Sheep= new Animals();
		Animals Tiger= new Animals();
		
		System.out.println("Sheep has "+ Animals.legs + " legs");
		System.out.println("Tiger has "+ Animals.legs+ " legs");
		
		Sheep.color=("White");
		System.out.println("Sheep has " +Sheep.color + " skin");
		Tiger.color=("Red");
		System.out.println("Tiger has " +Tiger.color + " skin");
		
		
		Animals.Herbs();  // static method calling
		
		// non static method calling
	   Sheep.herb(4,"grass eating animal");
		
		Tiger.carn(4,"meat eating animal");
		
		

	}

}
