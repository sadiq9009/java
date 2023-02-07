package com.Sadiq;



abstract class animal{
	
	void legs() {
		System.out.println("All animal has four legs");
	}
	
     abstract void sound();
     
     abstract void eat();
	
}

class Dog extends animal{
	
	void sound() {
		System.out.println("Bow Bow......");
	}
	void eat() {
		System.out.println("eating meat");
	}
}

class cow extends animal{
	
	void sound() {
		System.out.println("Amooo Amooo....");
	}
	
	void eat() {
		System.out.println("eating grass");
	}
	
}


public class Absclass {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		cow c = new cow();
		
		d.eat();
		d.sound();
		d.legs();
		
		c.eat();c.sound();c.legs();

	}

}
