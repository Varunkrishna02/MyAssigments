package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		List<String> learners = new ArrayList<String>();
		
		learners.add("Varun");
		learners.add("tharu");
		learners.add("Saro");
		learners.add("jeev");
		
		System.out.println(learners);
		
		//find size
		
		int count =learners.size();
		System.out.println(count);
		
		
	
		
		//add entry
		learners.add("Maha");
		System.out.println(learners);
		
		learners.add(1, "krish");
		System.out.println(learners);
	}

}
