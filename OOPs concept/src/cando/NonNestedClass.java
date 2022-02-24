package cando;
	

	class Out{                                   // outer class
		void print() {
			System.out.println("I am outer");
		}
	}
public class NonNestedClass {                     // main class
	void printname() {
		System.out.println("i am not Nested class");
	}
	
	public static void main(String[] args) {             // main method
		NonNestedClass n = new NonNestedClass();
		Out o = new Out();
		n.printname();
		o.print();
	}

}
// Use of outer call we can acess same with other class file, like added Out o = new Out(); o.print();  in nested class


