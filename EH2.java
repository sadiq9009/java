package com.Sadiq;

import java.util.Scanner;

public class EH2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		
		
		do {
		System.out.println("Enter the Age:");
		 age = sc.nextInt();
			try {
				if(age<18) {
					throw new EH1("You are not Eligible to vote ");
				}else {
					System.out.println("You can vote");
				}
			}catch(RuntimeException e){
				e.printStackTrace();
			}
			finally {
				System.out.println("Program Completed");
			}
		}while(age<50);

	}

}
