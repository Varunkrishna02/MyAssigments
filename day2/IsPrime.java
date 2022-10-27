package week1.day2;

public class IsPrime {

	public static void main(String[] args) {

		/*
		 * Home Assignment 2: Print if the given number is prime
		 * 
		 * Goal: To understand the problem solving, looping and conditional statement
		 * 
		 * a) Create a class by name: IsPrime b) Create a main method using shortcut c)
		 * Write a logic to find if the given number is prime or not d) Print if it is
		 * prime or not
		 * 
		 * Hint: Iterate through all numbers from 2 to n-1 (input) and for every number
		 * check if it divides n (input). If we find any number that divides(1 or same
		 * number), print prime. If nothing divides, then print non-prime.
		 */
		
		int num=14,i;
		 boolean flag=true;
		for(i=2;i<num;i++)
		{
		  
		  if (num%i==0)
		  {
		    flag=false;
		  }  	
		}
		
		 if (flag)
		  {
			  System.out.println(num  +  " is Prime number");
		  }
		 else
		 {
			  System.out.println(num  +  " is not Prime number");
		  }
			 
		}
		
	}


