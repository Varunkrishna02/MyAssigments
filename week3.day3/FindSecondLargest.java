package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<Integer>();
		
			
		Collections.addAll(list, 1,12,81,4,9,7);
		Collections.sort(list);
		
		System.out.println(list);
		
		int secondLargest= list.size()-2;
		
		System.out.println( "SecondLargest Num is "+list.get(secondLargest));
	}

}
