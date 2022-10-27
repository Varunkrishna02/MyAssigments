package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,a=0,b=1,c=0;
		int count=10;
		System.out.println(a);
		System.out.println(b);
		
		for(i=2;i<=count;i++)
		{
		 c=a+b;
		 
		 System.out.println(c);
			a=b;
			b=c;
		
			
		}
		
	}

}
