package cando;

class Device{
	void display() {
		System.out.println(" i am electronic device ");
	}
	
}
class TV extends Device{
	void display() {
		System.out.println(" i am a tV");
		super.display();    // if both are having same display() method then super key word is used.
	}
	
}
public class Super {

	public static void main(String[] args) {
		
		TV t = new TV();
		t.display();
		// t.display1();  If we add display1 in device then this is required
	}

}
