package Demopkg;

public class LocalVariables {
	
	int i = 50;
	
	// this keyword 
	public void m1()
	{
		int i=10;
		
		System.out.println(this.i);  //50
		
	}

	public static void main(String[] args) {
		
		LocalVariables Obj = new LocalVariables();
		//System.out.println(Obj.i);
	    Obj.m1();
	}

}
