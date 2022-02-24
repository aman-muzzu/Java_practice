package cando;

public class EncapsulationW {     // methods and data binding and done in single program, if we need to callfrom other class we use
	                             // getter and setter methods
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String n) {
		this.name=n;
	}
	public void setAge(int n) {
		this.age=n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
