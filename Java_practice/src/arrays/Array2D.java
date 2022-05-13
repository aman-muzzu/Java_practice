package arrays;

public class Array2D {

	public static void main(String[] args) {
		 int[][] array = new int [2][3];
		 
		 int num=200;
		 for(int i=0;i<array.length;i++) {
			 
			 for(int j=0;j<array[i].length;j++) {
				
				array[i][j]=num;
				num=num+100;
				System.out.println(array[i][j]);
				
				 
				 
			 }
			
			 
		 }

	}

}
