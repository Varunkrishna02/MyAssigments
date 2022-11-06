package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("StudentName -- Varun");
	}
	
	public void studentDept()
	{
		System.out.println("StudentName -- CS");
	}
	public void studentId()
	{
		System.out.println("StudentName -- SKC055");
	}
	
	public static void main(String[] args) {
	    
		Department secondClass = new Department();
		secondClass.collegeName();
		secondClass.collegeCode();
		secondClass.collegeRank();
		
		secondClass.deptName();
		
		Student thirdClass = new Student();
		thirdClass.studentName();
		thirdClass.studentDept();
		thirdClass.studentId();
		
	
	}
	
	//create above 3 class and call all your class methods into the Student using multilevel inheritance.

}
