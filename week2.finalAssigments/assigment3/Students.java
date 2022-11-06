package assigment3;

public class Students {
	
	/*
	 * Class: Students Methods: getStudentInfo()
	 * 
	 * Description: Create multiple getStudentInfo() method by passing id argument
	 * alone, by id & by name, by email & phoneNumber
	 */

	public void studentInfo(int studentID)
	{
		System.out.println("Student ID is "+ studentID);
		
	}
	
	public void studentInfo (int studentID, String studentName)
	{
		System.out.println ("Student ID is "+ studentID );
		System.out.println("StudentName "+ studentName);
		
	}

	public void studentInfo (int studentID, String studentName, String studentEmail)
	{
		System.out.println("Student ID is "+ studentID);
		System.out.println("StudentName "+ studentName);
		System.out.println("StudentEmail "+ studentEmail);
		
	}
	
	public void studentInfo (int studentID, String studentName, String studentEmail, int studentPhone)
	{
		System.out.println("Student ID is "+ studentID);
		System.out.println("StudentName "+ studentName);
		System.out.println("StudentEmail "+ studentEmail);
		System.out.println("StudentPhones is "+ studentPhone);
		
	}
	
	public static void main (String[] args)
	{
		Students poly=new Students();
		poly.studentInfo(055);
		poly.studentInfo(055, "Varun");
		poly.studentInfo(055, "Varun", "Varun@gmail");
		poly.studentInfo(055, "Varun", "Varun@gmail", 859632145);
	}
	
}
