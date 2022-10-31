package week1.day3;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		int[] score= {80,78,90,35,35,35,25};
		
		//length= property of variable
		int length = score.length;
		System.out.println(length);
		
		//get 1st value
		System.out.println(score[0] + " is first value");
		
		//get last value
		System.out.println(score[length-1] + " is first value");
		
		//Array Sorting - Asc
		Arrays.sort(score);
		for(int i=0;i<score.length;i++)
		{
		System.out.println(score[i]);
		}
		
		//Array Sorting - desc
		Arrays.sort(score);
		for(int i=length-1;i>=0;i--)
		{
		System.out.println(score[i]);
		}
		
       // Number Repetitions
		
		int find =35;
		int count=0;
		for(int i=0;i<length;i++)
		{
			if(score[i]==find)
			{
				count++;
				
			}
			
		}
		
		System.out.println("Repetated times " + count );
	}
	

}
