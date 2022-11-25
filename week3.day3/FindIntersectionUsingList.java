package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {

		/*
		 * * a) Declare An array for {3,2,11,4,6,7}; 
		 * b) Declare another array for
		 * {1,2,8,4,9,7};
		 */
	
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		
		Collections.addAll(list1, 3,2,11,4,6,7);
		Collections.addAll(list2, 1,2,8,4,9,7);
		
		System.out.println(list1);
		System.out.println(list2);
		
		int sizeofList1 = list1.size();
		int sizeofList2 = list2.size();
		
		
		List<Integer> MissingNums = new ArrayList<Integer>();
		
		for (int i=0;i<sizeofList1;i++)			
		{
			for(int j=0;j<sizeofList2;j++)
			{
				if (list1.get(i)==list2.get(j))
				{
					Collections.addAll(MissingNums, list1.get(i));
					
				}
			}
		}
		
		System.out.println("Intersected Numbers are "+ MissingNums);

	}

}
