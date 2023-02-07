package com.Sadiq;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Missing {
public static void main(String[] args) {
	
	List<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
	List<Integer> nums = new ArrayList<Integer>(Arrays.asList(11,12,13,14,15,16,17,1,2,5,4));
	
//	num.addAll(nums);
//	num.add(3453);
//	System.out.println(num);
//	num.removeAll(num);
//	System.out.println(num);
//	num.addAll(nums);
//	System.out.println(num);
//    num.retainAll(nums);
//    System.out.println(num);
	nums = (List<Integer>) ((Object)num);
	System.out.println(nums);
}
}
