package cando;

	class Animal{
		void pringA() {
		System.out.println("Animal is running");
	}
}
	class Dog extends Animal{
		void printB() {
		System.out.println("Dog is Barking");
	}
}

	public class InheritanceSingle {

		public static void main(String[] args) {
		Dog d =new Dog();
		d.pringA();
		d.printB();

	}

}
