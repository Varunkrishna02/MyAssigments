package assignment2;

public class AxisBank extends BankInfo{
	
	public void Deposit(int a)
	{
		System.out.println(a);
	}

	
	public static void main (String[] args)
	{
		BankInfo poly = new BankInfo();
		poly.deposit(5, 6, 7);
	}
}
