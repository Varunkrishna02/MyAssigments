package week2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		/*
		 * Declare a String String text1 = "stops"; Declare another String String text2
		 * = "potss"; a) Check length of the strings are same then (Use A Condition) b)
		 * Convert both Strings in to characters c) Sort Both the arrays d) Check both
		 * the arrays has same value
		 * 
		 */

		String text1 = "peach";
		String text2 = "cheap";

		char[] a = text1.toCharArray();
		char[] b = text2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		System.out.println(a);
		System.out.println(b);
		boolean equals = Arrays.equals(a, b);

		if (equals) 
		{
			System.out.println("Text1 and Text2 are Anagram");
		 } 
		else 
		{ 
			System.out.println("Text1 and Text2 are not Anagram");
		 }

	}

}
