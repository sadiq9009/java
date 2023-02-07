package com.Sadiq;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alist {
	
	  public static void main(String args[])
	    {
	  
	        // create a ArrayList String type
	        // and Initialize an ArrayList with List.of()
//	        ArrayList<String> gfg = new ArrayList<>(
//	            Arrays.asList("Geeks",
//	                    "for",
//	                    "Geeks","sadiq"));
	        
	       // System.out.println(gfg);
	  
//	        for (String i : gfg) {
//				System.out.println(gfg);
//			}
	        
//	        gfg.forEach(T->{
//	        	System.out.println(T);
//	        });
	        
	       // System.out.println("ArrayList : " + gag);
		  
		  ArrayList<Integer> num = new ArrayList(Arrays.asList(1,2,3,4,5));
		  
		  List<Integer>  nums = new ArrayList(Arrays.asList(1,10,5,6));
		  
		   nums = (List<Integer>) num.clone();
		   
		   System.out.println(nums);
		  
		  
		  
		  
		  
		  
		  
	    }
	
		
	}

