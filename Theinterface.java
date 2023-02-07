package com.Sadiq;


import java.util.Scanner;

interface Sadiqvehi{
	
	String Name = "Hayaboosa";
	int Gear = 4;
	
	default void oil() {
		System.out.println("The engine oil for:"+Name);
		
	}
	static void speed() {
		System.out.println("The of hayaboosa is 150km/H");
	}
	
	void start();
	void stop();
	void color();
	
}


class Theinterface implements Sadiqvehi{
	
	public void start() {
		System.out.println("Start():insert the key and press the button");
	}
	
	public void stop() {
		System.out.println("Stop():turn off the key");
	}
	
	public void color() {
		System.out.println("The color of hayaboosa is Red");
	}

	public static void main(String[] args) {
	 Theinterface i = new Theinterface();
		
		i.start();i.stop(); i.color();
		i.oil();
		Sadiqvehi.speed();

	}

}