package cando;

public class Methodoverloading {

	static int addition(int a, int b) {   // method  here 2 int values
		return a+b;
	}
	
	static int addition(int a, int b, int c) {  // method  here 3 int values
		return a+b+c;
	}
	
	static double addition(double a, double b, int c) {  // method here 2 double and 1 int value
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(addition(10,20));    // passing arguments for addition int,int
		System.out.println(addition(10,20,30)); // passing arguments for addition int,int,int
		System.out.println(addition(10.4,20.5,30));// passing arguments for addition double,double,int

	}

}
