package week1.day3;

public class Variable {
	
	//Global Variable -- Can access in any methods
	int a=10;
	String str="Varun";

	public void num()
	{
		//Local Variables -- Inside method - Only accessible in these methods
		int sum=20;
		System.out.println(sum);
		System.out.println(a);
	}
	
	public void phone()
	{
		//Local Variables -- Inside method - Only accessible in these methods
		int Add=20;
		System.out.println(Add);
		System.out.println(str);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variable obj= new Variable();
		obj.phone();
		obj.num();
		
		
	

	}

}
