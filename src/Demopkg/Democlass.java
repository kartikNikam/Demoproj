package Demopkg;

public class Democlass {
	
	 public static void  pratik()
	   {
		  // int i =20; // local variable
		   System.out.println(VariablesDeclaration.i);
	   }
	 
	 public void Pqr() {
		 
		 System.out.println("this is pratik's method");
	 }
	 
	 public void Anuja() {
		 System.out.println("This is anuja's method");
		 
		 System.out.println(Variabledeclaresnonstatic.k);
		
		 
	 }
	 

	public static void main(String[] args) 
	{
		
		// byte bytename = 127;
		// byte = 1 byte / 8 bits = +127 - -128  2^8 = 256
		byte a =127;
		
		//short
		// short = 2 bytes or 16bits +32767 - -32768
		short sh = 32767;
		
		//integer = 4 bytes or 32 bits 2147483647  -21474883648
		
		int i = 200;
		
		// long = 8 bytes or 64 bits 2^63-1  - 2^63
		long q = 1000000;
		
		// float = 4bytes  -3.4*10^38 to 10^38
		
		float f = 1.2666666355f;
		double d = 1.3099888877774777777378888883;
		
		// boolean choice 2  true / false
		
		boolean b = true;
		boolean b1 = false;
		
		// char = 2 bytes
		
		char ch = 's';
		char as ='$';
		char bb= '1';
		char se = 'w';
		
		
//		ClassObject.myfirstmethod();
//		
//		 Democlass Pratik = new Democlass();
//		 Pratik.Pqr();
		
		 //pratik();
		
		 Variabledeclaresnonstatic Obj2 = new Variabledeclaresnonstatic();
		 System.out.println(Obj2.i);
		 System.out.println(Obj2.j);
		System.out.println(Variabledeclaresnonstatic.k); 
		Obj2.pqr();
		
		Democlass t = new Democlass ();
		t.Anuja();
		 
		 
		 
	}

}
