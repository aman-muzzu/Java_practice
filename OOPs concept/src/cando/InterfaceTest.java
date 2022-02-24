package cando;


		interface Printable{   // creating interfarce
			int a=20;  // suppose ex
			void print();  // abstract method -- ther will be no method body simple will  close
		}
		
		interface Showable{
			void show();
		}


		    public class InterfaceTest implements Printable, Showable {
			public void print(){
				System.out.println("Print");
			}
			public void show(){
				System.out.println("Show");
			}

	public static void main(String[] args) {
		InterfaceTest I = new InterfaceTest();
		I.print();
		I.show();
		System.out.println(I.a);

	}

}
