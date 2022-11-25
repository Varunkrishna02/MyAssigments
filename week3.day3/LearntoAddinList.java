package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class LearntoAddinList {

	public static void main(String[] args) {


		String[] names = {"Varun","krish","Tharu"};
		
		List<String> list = new ArrayList<String>();
		
		//adding array in List
		for (String each : names) //datatype variable : datanames
		{
			
			list.add(each);
			
		}
		
		System.out.println(list);

	}

}
