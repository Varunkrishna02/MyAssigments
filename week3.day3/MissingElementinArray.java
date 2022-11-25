package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementinArray {

	public static void main(String[] args) {



		List<Integer> list = new ArrayList<Integer>();		
		Collections.addAll(list, 1,2,3,4,5,7,8,9);
		Collections.sort(list);
		System.out.println(list);
		
		List<Integer> MissingNums = new ArrayList<Integer>();	
		
		int size = list.size();
		System.out.println(size);
		
		for (int i=0;i<=size;i++)
		{
			if (list.get(i)!= i+1)
			{
				Collections.addAll(MissingNums, list.get(i)-1);
				break;
			}
		}
		
		System.out.println("Missing Number is"+MissingNums);
		
	}

}
