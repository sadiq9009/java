package com.Sadiq;


import java.util.Scanner;

public class Guessnum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = 1 + (int)(Math.random()*100);
		
		int k = 15;
		
		int i,guess;
		
		System.out.println("choose the number");
		
		for(i = 0; i<=k; i++) {
			
			System.out.println("guess the number");
			
			guess = sc.nextInt();
			
			if(number == guess) {
				
				System.out.println("congratulation :"+"U have guess correct");
				
			}
//			else if(number > guess){
//				System.out.println("the number is greater");
//			}else if(number < guess) {
//				System.out.println("the number is lesser");
//			}else {
//				System.out.println("enter the valid number");
//			}
			
			String output = (number > guess) ? ("the number is greater") : ("the number is less");
			
			System.out.println(output);
			
			if(i==k) {
				System.out.println("the trail has exhausted");
				
				System.out.println("the number was :"+number);
				
				
			}	
			
		}
		

	}

}