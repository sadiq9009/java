package com.Sadiq;

public class AccountExam1 {

	private String id;
	
	private String name;
	
	private int balance = 0;
	
	public AccountExam1(String id, String name) {
		
		this.id = id;
		
		this.name = name;
		
	}
	
public AccountExam1(String id, String name,int balance) {
		
		this.id = id;
		
		this.name = name;
		
		this.balance = balance;
		
	}

public String getId() {
	return id;
}

public String getName() {
	return name;
}

public int getBalance() {
	return balance;
}

   public int Credit(int amount) {
	return this.balance += amount;
   }
   
   public int Debit(int amount) {
		if(amount<=this.balance) {
			return balance -= amount;
		}else {
			System.out.println("Amount Exceeded");
			return this.balance;
		}
	   }
   
   
   public int tranferTo(AccountExam1 another, int amount) {
		if(amount<=this.balance) {
			this.balance -= amount;
			another.Credit(amount);
			return this.balance;
			
		}else {
			System.out.println("Amount Exceeded");
			return this.balance;
		}
	   }

@Override
public String toString() {
	return "AccountExam1 [id=" + id + ", name=" + name + ", balance=" + balance + "]";
}
   
	
}
