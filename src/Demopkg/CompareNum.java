package Demopkg;

public class CompareNum {
	
	public float CompareNumber() {
		float x = 15.2f;
		float y = 10.6f;
		System.out.println("value of x"+x +"value of y"+y);
		
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
		public static void main(String[] args) {
		
			 CompareNum Obj = new CompareNum();
			float Compare= Obj.CompareNumber();
			System.out.println("Largest No is =" +Compare);
		
		

	}

}
