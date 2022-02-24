package cando;

public class ThisKeyword {
	String n;
	
	ThisKeyword (String n){  //  both string n passed is same like n=n, so this keyword come in picture
		this.n=n;           //this.n is instance variable, and only n is local variable
	}
	
	void display() {
		this.display1();   // we can use and we can ignore this key word results will be same
	System.out.println("This is this keyword tutorials "+ n);
	}
	
	void display1() {
		System.out.println("Hii");
		}

		public static void main(String[] args) {
		ThisKeyword t= new ThisKeyword("aman");
		t.display();
		
	}

}
