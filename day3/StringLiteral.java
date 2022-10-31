package week1.day3;

public class StringLiteral {

	public static void main(String[] args) {
		
		//String Literals
		String companyName= "Testleaf";
		
		//String Objects
		
		String company=new String("TestLeaf");	
		
		//1.To find length of Stringobject
		
		int length = company.length();
		System.out.println("Length of company is "+ length);
		
		//2 Converting String to Array
		char[] chars=company.toCharArray();
		
		for(int i=0;i<chars.length;i++)
			
		{
			System.out.println(chars[i]);
			
		}
		
		//3.Comparing two strings whether equal
		
		boolean equals = companyName.equals(company);
		System.out.println("Result is "+equals);
		
		//4.Equalsignorecase
		
		boolean equalsIgnoreCase = companyName.equalsIgnoreCase(company);
		System.out.println(equalsIgnoreCase);
		
		//5.contains
		
		boolean contains = company.contains("Test");
		System.out.println(contains);
		
		//6.Index of character
		
		int indexOf = company.indexOf("s");
		System.out.println(indexOf);
       
		//7.Character's Index
		
		char charAt = company.charAt(2);
		System.out.println(charAt);
	}

}
