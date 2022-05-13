package examplesAssignments;

import java.text.DecimalFormat;
import java.util.Random;

public class ArrrayOTP {

	public static void main(String[] args) {
		
		int[]  array = new int[0];
		
		//for(int i=0;i<=0;i++) {
			
		//	System.out.println(((int)(Math.random()*10000)));
		
			String otp= new DecimalFormat("0000").format(new Random().nextInt(9999));
			System.out.println(otp);
			
		//}
	}

}
