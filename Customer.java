package com.Sadiq;


import java.util.Scanner;

abstract class BankA{
	
	public String Name = "SBI";
	
	public String IFSCCODE = "GHCJJHH";
	
	public void BankDetail() {
		System.out.println("The name is bank is:"+Name+" "+"Bankifsc:"+IFSCCODE);
	}
	
	abstract void Deposit();
	abstract void Withdraw();
	abstract void CheckBal();
}

 class bankService extends BankA
{
	 private double bal = 50000.0;
     private int pwd;
     private double money;
     
     public void Deposit() {
 		System.out.println("Enter the password");
 		Scanner s = new Scanner(System.in);
 				pwd = s.nextInt();
 		if(pwd==2008){
 			System.out.println("Enter the amount");
 			money = s.nextDouble();
 			bal = bal+money;
 			System.out.println("Deposite money:"+money);
 			System.out.println("Total balance:"+bal);
 		}
 		else
 		{
 			System.out.println("Incorrect Password....");
 		}
 	  }
 	public void Withdraw() {
 		System.out.println("Enter the password");
 		Scanner s = new Scanner(System.in);
 		pwd = s.nextInt();
     if(pwd==2008){
    		System.out.println("Enter the amount");
 			money = s.nextDouble();
 	bal = bal-money;
 	System.out.println("Withdraw money:"+money);
 	System.out.println("Total balance:"+bal);
     }
     else
     {
 	System.out.println("Incorrect Password....");
     }
 	}
 	public  void CheckBal() {
 		System.out.println("Enter the Password");
 		Scanner s = new Scanner(System.in);
 		pwd = s.nextInt();
 		if (pwd==2008) {
 			System.out.println("Total balance:"+bal);
 		} else {
                System.out.println("Incorrect Password...");
 		}
 	}

 }
public class Customer {

	public static void main(String[] args) {
		bankService b = new bankService();
		b.BankDetail();
		int ch;
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. CheckBal");
		
		System.out.println("Enter the choice");
		
		Scanner s2 = new Scanner(System.in);
		
		ch = s2.nextInt();
		
		switch (ch) {
		case 1: b.Deposit();  
		break;
		case 2: b.Withdraw();
		break;
		case 3: b.CheckBal();
		break;

		default:System.out.println("Incorrect Choice...");
			break;
		}

	}

	}
