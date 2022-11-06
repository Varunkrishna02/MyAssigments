package week2.assignments;

public class Palindrome {

	public static void main(String[] args) {

         String str = "Madam" , revStr="";
         
         char[] strArr= str.toCharArray();
         
         int n= str.length();
         
         for (int i=(n-1);i>=0;i--)
         {
        	 revStr = revStr + strArr[i];
         }
         
         if(str.toLowerCase().equals(revStr.toLowerCase())) 
         {
        	System.out.println("Palindrme"); 
         }
         else
         {
        	 System.out.println("Not Palindrme"); 
         }
       
 
	}

}
