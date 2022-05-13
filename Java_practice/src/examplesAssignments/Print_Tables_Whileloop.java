package examplesAssignments;

import java.util.Scanner;

public class Print_Tables_Whileloop {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter table number:");
		
		int num = Scan.nextInt();
		System.out.println("Enter the range: ");
		
		int range=Scan.nextInt();
		int i=1;
		
		while (i<=range){
			
			System.out.println(num*i);
			i++;
			
		}
		

	}

}
