package week3.day3;

public class ChildforSuper extends ParentClassforSuper {
	
	public void land2()
	{
		System.out.println("Childclass");
	}
	
	public void land1()
	{
		super.land1(); //oly in Inheritance you can use super keyword
		//System.out.println("Overriding Method of ParentClass");
	}

	public static void main(String[] args) {

		ChildforSuper obj=new ChildforSuper();
		obj.land2();
		obj.land1();

	}

}
