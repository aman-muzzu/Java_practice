package methodstest;

import java.util.Scanner;

public class SampletestMethodInt {

	public static void main(String[] args) {
		
		
		SampletestMethodInt obj = new SampletestMethodInt();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first value"  );
		
	int x=sc.nextInt();
	System.out.println("enter second value");
	
	int y=sc.nextInt();
	
	int z=obj.AddTwoNumbers(x, y);
	 System.out.println("Addition of 2 numbers is:  "+z);
		

	}
	
	public int AddTwoNumbers(int a,int b){
		int c= a+b;
		return c;
		
	}
	

}
