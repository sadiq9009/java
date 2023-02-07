package com.Sadiq;

import java.util.Scanner;

public class Fabbinocc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n1 = 0;
		
		int n2 = 1;
		
		int count = sc.nextInt();
		
		for (int i = 0; i <=count; ++i) {
			
			System.out.print(n1+" ");
			
			int temp = n1 + n2;
			
			n1 = n2;
			
			n2 = temp;
			
		}
		
		//System.out.println(count);

	}

}
