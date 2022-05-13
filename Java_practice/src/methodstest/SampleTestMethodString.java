package methodstest;

import java.util.Scanner;

public class SampleTestMethodString {
	
	
	/*
	 * create method-->pass 2 string--return sting--concatenate
	 * Aman, Muzzu--->AmanMuzzu--->there should be same between 2 strings
	 */
	

	public static void main(String[] args) {
		
		SampleTestMethodString obj= new SampleTestMethodString();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter First name: ");
		
		String s1=scan.nextLine();
		System.out.println("Enter second name: ");
		
		String s2=scan.nextLine();
		
		String Returnstring=obj.concatenatetwostring(s1,s2);
		
		System.out.println("My name is: "+ Returnstring);
		

	}
	
	public String concatenatetwostring(String str1,String str2){
		
		String finalstring=str1+" "+str2;
		return finalstring;
		
	}

}
