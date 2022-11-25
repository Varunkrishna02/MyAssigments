package week3.day3;



public class LearnConstructor {

	int empID;
	String empName;
	boolean empStatus;

//Default Constructor	

	LearnConstructor() {
		System.out.println("Assigning Values to DefaultCons");
		empID = 110;
		empName = "Varun";
		empStatus = true;
	}

	 LearnConstructor(int empID,String empName,boolean empStatus) 
	 {
		 
		 this();  //this is used to call Default constructor
		 System.out.println("Assigning Values to Parameterized Constructor");
		 
		 this.empID=empID;
		 this.empName=empName;
		 this.empStatus=empStatus;
	}
	

	public static void main(String[] args) {

		LearnConstructor obj = new LearnConstructor(100, "krish", false);
		System.out.println(obj.empID);
		System.out.println(obj.empName);
		System.out.println(obj.empStatus);

	}

}
