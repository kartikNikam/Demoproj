package Demopkg;

public class Variabledeclaresnonstatic {
	
	// class level
	//object through call --> static 
	// datatype variable_name;
	//int i;
	//scope
	int i =50;  // non static var
	int j;
	static int k = 20;
	
	public void pqr() {   // nonstatic 
		System.out.println(i); // direct
		
		System.out.println(k);  // direct
		
	}
	
	

	public static void main(String[] args) {  // static 
		
		Variabledeclaresnonstatic Obj1 = new Variabledeclaresnonstatic(); // object
//		System.out.println(Obj1.i);
//		
//	Obj1.i=60;
//	
//	 System.out.println(Obj1.i);
		
				Obj1.pqr();  // non static method
		
		Obj1.j=40;
		System.out.println(Obj1.j); //
		System.out.println(Obj1.i);
		
		System.out.println(Obj1.k); // non recommendded 
		System.out.println(k);
		
		

	}

}
