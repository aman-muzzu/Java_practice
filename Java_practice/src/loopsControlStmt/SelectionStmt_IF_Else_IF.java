package loopsControlStmt;

// you can add n no/- else-if cond

public class SelectionStmt_IF_Else_IF {

	public static void main(String[] args) {
		int size = 16;
		 if(size<=4) {
			 System.out.println(" size is small  S");
		 }
		 else if(size>=4 && size <=10){
			 System.out.println("size is medium  M");
			 
		 }
		 else if (size>=11 && size<=15){
			 System.out.println("size is large  XL");
		 }
		 else {
			 System.out.println("size is extra large XXL");
		 }

	}

}
