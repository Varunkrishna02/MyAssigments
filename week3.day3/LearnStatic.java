package week3.day3;

public class LearnStatic {
	
	public void add() {
		
	}
	
	public static void sub()
	{
		System.out.println("I can be called jus by declaring method name in main method");
	}
	static
	{
		System.out.println("static block");
	}
	public static void main(String[] args) {
		sub();
	}
	

}
