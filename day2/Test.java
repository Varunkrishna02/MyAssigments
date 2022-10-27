package week1.day2;

public class Test {

	public static void main(String[] args) {
		int number = 1919;
		boolean isPrime = false;
		System.out.print(number+" dividends are: ");
		for(int dividend = 2; dividend<number; dividend++)
		{
			int reminder = number%dividend;
			if(reminder==0) {
				System.out.print(dividend+" ");
				isPrime = true;
			}
		}
		System.out.println();
		if(!isPrime)
			System.out.println(number+" is a prime number");
		else
			System.out.println(number+" is not a prime number");

	}
	

}
