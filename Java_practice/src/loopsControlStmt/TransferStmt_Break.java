package loopsControlStmt;

public class TransferStmt_Break {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) 
		{
			if(i<=5) {
				System.out.println(i);
			}
			else {
				break;
			}
		}

	}

}
