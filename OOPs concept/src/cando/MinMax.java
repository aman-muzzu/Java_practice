package cando;

import java.util.Scanner;

public class MinMax {
	int i;
	int s;
	//void min(int a, int b) // instance method
	static void min(int a, int b) // if static is used object is not required--->Prameters/formal parameters
	{
		if (a>b)
	System.out.println(+a +" is max number");	
		else {
			System.out.println(+b +" is max number");
		}
			
	}
	public static void main(String[] args) {
		MinMax m1 =new MinMax();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		m1.min(c,d); // calling with instance /nonstatic method we use object
		min(c,d);  // calling with out object with static method
		MinMax.min(c, d);          //calling with class name: MinMax.min(c,d)   ---Arguments/Actual parameters
		
		
	}

}
