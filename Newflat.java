package com.Sadiq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Newflat {

	public static void main(String[] args) {
	
		List<List<String>> arr = Arrays.asList(
				Arrays.asList("Shaik","sadiq"),
				Arrays.asList("Shaik","saad"),
				Arrays.asList("Shaik","shayan"));
		
		
		List<String> string = new ArrayList<>();
		
//		for(int i=0; i<arr.size();i++) {
//			for(int j=0; j<=i;j++) {
//				string.add(j);
//				System.out.println(j);
//			}
//				
//		}
//		System.out.println(string);
		
		List<String> arrs = arr.stream().flatMap(Collection::stream).collect(Collectors.toList());
		
		System.out.println(arrs);
	}
	
	
}
