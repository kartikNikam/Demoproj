package Demopkg;

 public class ClassObject {
	 
	// 1. regular method
			 // 2. main method
			 // 1.a static method : class level method // loaded at time of class
			 // loading 
	 int i = 20 ; // global varible
	 int j = 30;
	 
   public static void  myfirstmethod()
   {
	   int i =10; // local variable
	   System.out.println("value of variable=" +i);
   }
	 
	public static void main(String[] args) {
		
	//object :combination of state (variables) & behavior (methods) 	

//		i.	java.lang.String
//		ii.	java.lang.System
//		iii.java.lang.Exception
//		iv.	java.lang.Object
//		v.	java.lang.Class
//		vi.	java.util.Date
//		vii.java.util.HashMap
//		viii.java.util.ArrayList
//		ix.	java.util.Iterator
//		x.	java.lang.Thread

		
//   As the name suggests, a custom or user-defined class is a class that is created by a user.
//     It will contain the class members as defined by the user.     
		
//		int a;  // declaration
//		 a = 101; // initialization
//		 int a = 102;
//		 System.out.println(a);
		 
		 // variables   global or local
		 //constructors 
		 // methods  static / non static 
		 // main
		 // objects 
		 // parameters // arguments 
		 
		myfirstmethod();  // method calling  same class static method 
		Democlass.pratik(); // another class static method 
		
	}

}
