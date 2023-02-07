package com.Sadiq;


import java.util.Scanner;

class Banks {
	
	private double bal = 5000.0;
	private int pwd;
	
	public void Deposit(double money) {
		System.out.println("Enter the password");
		Scanner s = new Scanner(System.in);
				pwd = s.nextInt();
		if(pwd==2008){
			bal = bal+money;
			System.out.println("Deposite money:"+money);
			System.out.println("Total balance:"+bal);
		}
		else
		{
			System.out.println("Incorrect Password....");
		}
	  }
	public void Withdraw(double money) {
		System.out.println("Enter the password");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();
    if(pwd==2008){
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
   class Bank{
	   
	public static void main(String[] args) {
		Banks bs = new Banks();
		int ch;
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. CheckBal");
		
		System.out.println("Enter the choice");
		
		Scanner s2 = new Scanner(System.in);
		
		ch = s2.nextInt();
		
		switch (ch) {
		case 1: bs.Deposit(2000);  
		break;
		case 2: bs.Withdraw(2000);
		break;
		case 3: bs.CheckBal();
		break;

		default:System.out.println("Incorrect Choice...");
			break;
		}

	}

}