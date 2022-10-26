package week1.day1;

public class Car {
	
	public void driveCar()
	{
		System.out.println("Bought a newcar");
	}
	
	public void applyBrake()
	{
		System.out.println("PressBrake");
	}
	public void soundHorn()
	{
		System.out.println("ApplyHorn");
	}
	
	public void isPuncture()
	{
		System.out.println("CarPuncture");
	}
	
	public static void main(String[] args) 
	{
		Car obj=new Car();
		obj.driveCar();
		obj.applyBrake();
		obj.soundHorn();
		obj.isPuncture();
	}
	

}
