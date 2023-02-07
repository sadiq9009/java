package com.Sadiq;

public class FindExample {

	public static void main(String[] args) {
		
		double [] arrnum = { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5 };

		
		double max = arrnum[0];
		
		for (int i = 0; i<arrnum.length; i++) {
			
			if(arrnum[i]>max) {
				
				max = arrnum[i];
				
				System.out.println(max);
				
			}
			
		}
		
	}

}
