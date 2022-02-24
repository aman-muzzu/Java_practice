package cando;

// class within a class

		class Outer{                  // this is outer class
	
				class Inner{        // inner class
					
				}
		}

			public class NestedClass {

			public static void main(String[] args) {
		
				//  below code added reference to use outer results from nonnested class 
				Out o = new Out();
				o.print();
	}

}
