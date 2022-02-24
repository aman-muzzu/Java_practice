package cando;

public class CallbyRef {
	int a;
	int b;
	private static void add(CallbyRef op,CallbyRef op1) {
		op.a = 10;
		System.out.println("Results from method:" +(op.a+op.b));
		
		
	}

	public static void main(String[] args) {
		CallbyRef op = new CallbyRef();
		CallbyRef op1 = new CallbyRef();
				op.a=2;
				op.b=3;
				System.out.println("Befor passing Results from main:"+ (op.a+op.b));
				add(op,op);
				System.out.println("After passing Results from main:"+ (op.a+op.b));
		
	

	}

}
