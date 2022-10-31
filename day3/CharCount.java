package week1.day3;

public class CharCount {

	public static void main(String[] args) {

		String str = "cocgnizant";
		int count=0;
		char ch='c';
		
		
		char[] chars=str.toCharArray();
		int len= chars.length;
		
		for(int i=0;i<len;i++)
		{
			if(chars[i]==ch)
			{
				
				count++;
			
			}
		}
			System.out.println("Length of given character "+len);
			System.out.println("Repeated times of given character "+count);
		}

	}

