package cando;
	class Animals{
	void pringA() {
	System.out.println("Animal is Running");
	}
}
	class Dogs extends Animals{
	void printB() {
	System.out.println("Dog is Barking");
	}
}
	class Labradars extends Dog{
	void printC() {
	System.out.println("Labradars is Black");
	}
}

public class InheritanceMultilevel {

	public static void main(String[] args) {
		
		Labradars L= new Labradars();
		L.pringA();
		L.printB();
		L.printC();

}

}
