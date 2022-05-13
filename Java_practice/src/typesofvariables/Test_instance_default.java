package typesofvariables;

public class Test_instance_default {
	
	int a;
	double d;
	float f;
	String s;
	char c;
	

	public static void main(String[] args) {
		// if you are not assign any value to variable you will get default values as below.
		
		Test_instance_default obj = new Test_instance_default();
		System.out.println(obj.a);   //0
		System.out.println(obj.d);   //0.0
		System.out.println(obj.f);   //null
		System.out.println(obj.s);   // single space
		System.out.println(obj.c);   //no single space

	}
	
	void add(){
		Test_instance_default obj= new Test_instance_default();   // you can also use this instance in other method also
		System.out.println(obj.a);
		
		
	}

}
