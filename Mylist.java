package com.Sadiq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Mylist {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,2,1,2,2,4,5,4,8,2,3,1,5,4,6,9,8,4,5);
		
		List<Integer> duplicate = new ArrayList<>();
		
//		for (int nums : num) {
//			
//			if(!duplicate.contains(nums)) {
//				duplicate.add(nums);
//				
//			}
//			
//		}
//		System.out.println(duplicate);
		
//	 List<Integer> Stream = num.stream().distinct().collect(Collectors.toList());
	 
	 List<Integer> Stream = num.stream().distinct().filter(t->t%2==0).collect(Collectors.toList());
//		 
	                System.out.println(Stream);

	}

}
