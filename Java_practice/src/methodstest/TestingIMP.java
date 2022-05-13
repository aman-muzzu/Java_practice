package methodstest;

public class TestingIMP {
	
	
	// In Testing you will be getting this type of methods adding frequently
	// Q:create method-->return the object of testing class
	public static void main(String[] args) {
		
		TestingIMP obj= returnobj();
		obj.add();
	

	}
	
	
	public static TestingIMP returnobj(){
		TestingIMP t = new TestingIMP();
		return t;
		
		
	}
	
	public void add() {
		int sum= 10+20;
		System.out.println("Sum--->"+ sum);
		
	}

}
