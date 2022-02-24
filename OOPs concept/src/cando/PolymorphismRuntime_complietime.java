package cando;

 // for polymorphism we are using inheritance conceprt of paren and child for hiding and overriding.
 //hiding -- compile time;    overriding---Runtime below example

	class Animalss{                                   // parent class 
		static void run1(){                               //method hiding
			System.out.println("h--Animals is running");
		}
		void run2(){                                     // method overriding
			System.out.println("0--animal is running");
		}
	
	}
	class Cheeta extends Animalss{                  // child class extend parent
		static void run1(){                                //method hiding
			System.out.println("h--Cheeta runs fastly");
		}
		void run2(){                                     // method overriding
			System.out.println("0--Cheeta runs fastly");
		}
		
	}


		public class PolymorphismRuntime_complietime {

			public static void main(String[] args) {
		
				//Cheeta A= new Cheeta();
				//Animalss A = new Animalss();
				Animalss A = new Cheeta();
		
				A.run1();  // hiding
				A.run2();   // overriding
		
		
	
	}

}
