package cando;

public class Instance_staticvariable {
	int i= 99;   //instance
	static int s=77;// static
	
	

	public static void main(String[] args) {
		Instance_staticvariable f1= new Instance_staticvariable();
		Instance_staticvariable f2 = new Instance_staticvariable();
		System.out.println(""+f1.i); // for  instance we need object creation so we have created f1 obj//99
		System.out.println(""+s); // for non static we dont requird obj directly we can acess//77
		System.out.println(""+f1.s); // 77
		System.out.println(""+f2.s); //77
		 f1.i=100;
		 f2.s=200;
		
		System.out.println("----------------");
		
		System.out.println(""+f1.i); //100
		System.out.println(""+f2.i); //99
		System.out.println(""+f1.s); //200
		System.out.println(""+f2.s); //200
     
	}

}
