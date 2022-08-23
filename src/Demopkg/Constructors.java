package Demopkg;

public class Constructors {
	// special method 
		// object is created
		// name of constructor is same name as class name 
		//arguments accepts
		//cant have any return type
		// single class have multiple constructors 
	
	public int m;
	public int s;
	public int e;
	
	public  Constructors(int m,int s,int e) 
	{
		this.m=m;
		this.s=s;
		this.e=e;
		System.out.println("value of m is :" +this.m);
		System.out.println("value of s is :"+this.s);
		System.out.println("value of e is :"+this.e);
		System.out.println("constructor with three arguments");
	}
	public Constructors(int m)
	{
		System.out.println("constructor with one argument");
	}
	public Constructors(int m,boolean b)
	{
		System.out.println("Constructor with two arguments");
	}
		
	public static void main(String[] args) {
		
		Constructors Obj = new Constructors(10,20,30);
		Constructors Obj1 = new Constructors(10);
		Constructors Obj2 = new Constructors(10,false);
	
	
		
		
		
		
		
		
		
		
	}

}
