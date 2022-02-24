package cando;

public class Finalkeyword {
	
   final int a=10;     //if we add final key word thiscannot change value of variable

	public static void main(String[] args) {
		
		Finalkeyword F=new Finalkeyword();
	    //  F.a=20;    // if we add this output wil be 20 instead of 10 if i add final in main class
		System.out.println(F.a);

	}

}
