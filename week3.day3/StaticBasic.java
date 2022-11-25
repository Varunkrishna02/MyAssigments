package week3.day3;

public class StaticBasic {
	
	int empId;
	String empName;
	String companyName;
	
	public void setValues(int id,String Name,String compName) {
		empId= id;
		empName=Name;
		companyName=compName;
		
	}
	public void printValues(){
	System.out.println(empId+" "+empName+" "+companyName);
		
	}
	

	public static void main(String[] args) {
		StaticBasic obj=new StaticBasic();
		obj.setValues(100, "Varun", "CTS"); //Declaring Values in static method
		obj.printValues(); //Calling print method

	}

}
