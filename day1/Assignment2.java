package week1.day1;

public class Assignment2 {
	
	//Accessmodifier Returntype name() -- Syntax for methods
	
	public void testName() 
	{
		System.out.println("Hi Phones");
	}
	
	public int getPhonenumbers()
	{
		return 23456;
		
	}
	
	public String getPhonecolor() 
	{
		return "red";
		
	}
	
	public static void main(String[] args) 
	{
	//classname objectname = new classname(); //
	
		Assignment2 obj=new Assignment2();
		obj.testName();
		
		int Phonenumbers = obj.getPhonenumbers();
		System.err.println(Phonenumbers);
     
		String Phonecolor = obj.getPhonecolor();
		System.out.println(Phonecolor);
	}

}
