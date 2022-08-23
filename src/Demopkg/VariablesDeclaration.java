package Demopkg;

public class VariablesDeclaration {
	
	// static variables 
	//non static variables 
	//local variables 
// 1.Static variables 
	//class level variables 
	// syntax = static datatype+variablename = value;
	static int i = 50 ; 
	
	public static void A1() {
		
		System.out.println("value of i is in static method A1" +i);
	}
	
	public void m1() {
		System.out.println("value of i in non static method m1" +i);
	}
	
	public static void main(String[] args) {
		VariablesDeclaration Obj = new VariablesDeclaration();
//		Obj.m1();
//		
//		A1();
		
		int y = i+2;
		System.out.println(y);
		
		
		
		
		
		
		
		

	}

}
