package Demopkg;

public class ReturnArguments {
	
	public int add(int x,int y)  //arguments
	{
		int z = x + y;
		return z;
		}
	
	public static void main(String[] args) {
	
		ReturnArguments Obj = new ReturnArguments();
		             int add = Obj.add(10,30);
		System.out.println(add);
		
		
	}

}
