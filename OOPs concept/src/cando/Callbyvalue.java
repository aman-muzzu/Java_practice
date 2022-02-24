package cando;

public class Callbyvalue {
	int a;
	int b;
	private static void add(int s,int t) { // para   // created one method
		s=10;
		System.out.println("Results from method:" +(s+t));
	}
	
	public static void main(String[] args) {
		Callbyvalue op=new Callbyvalue();  //obj created
		op.a=2;
		op.b=3;
		System.out.println("Befor passing:" +(op.a + op.b));
		
		add(op.a,op.b); // Arg
		System.out.println("After passing:" +(op.a + op.b));
	

	}

}
