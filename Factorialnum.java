package com.Sadiq;

import java.util.Iterator;
import java.util.Scanner;

public class Factorialnum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to get factorial");
		
		int num = sc.nextInt();
		
		int i;
		int fact = 1;
       
        
        for(i=1;i<=num;i++) {
        	
        	fact = fact*i;
        	
        }
        
        System.out.println("Factorial of: "+num+", is: "+fact);
	}

}
