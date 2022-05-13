package loopsControlStmt;
// for (initialization; condition; increment/decrement)
//only 2 semi-colon is mandatory  like for(;;)
// Condition is imp or else it will generate infinite timers output

public class IterativeStmt_Forloop {

	public static void main(String[] args) {
		
		for (int i=1;i<=10;i++) {
			System.out.println(i);  // o/p: 12345678910
		
		//  i++;   // o/p:13579
		}
		

	}

}
