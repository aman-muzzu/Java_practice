package cando;
	class Anima{
		void pringA() {
			System.out.println("Animal is Running");
		}
}
	class Dogg extends Anima{
		void printB() {
			System.out.println("Dog is Barking");
		}
}
	class Cats extends Anima{
		void printC() {
			System.out.println("Cat says Mew'");
		}
}

		public class InheritanceHeriracial {

			public static void main(String[] args) {
				Dogg D= new Dogg();
				Cats C= new Cats();
	
				C.pringA();
				C.printC();
				D.pringA();
				D.printB();
	

			}

}
