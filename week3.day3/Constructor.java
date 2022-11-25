package week3.day3;

public class Constructor {

	int empID;
	String empName;
	boolean empStatus;
	

	Constructor() {
		System.out.println("Assigning Values to DefaultCons");
		empID = 110;
		empName = "Varun";
		empStatus = true;
	}
	
		public static void main(String[] args) {

			Constructor obj = new Constructor();
			System.out.println(obj.empID);
			System.out.println(obj.empName);
			System.out.println(obj.empStatus);

		}
}
