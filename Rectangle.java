package com.Sadiq;


public class Rectangle implements Geometric {

	double l;
	double b;
	
	public Rectangle(double l,double b) {
		this.b=b;
		this.l=l;
	}

	@Override
	public double Getarea() {
		System.out.println("The area of Rectangle is:"+l*b);
		return 0;
	}

	@Override
	public double GetPerimeter() {
		System.out.println("The perimeter of Rectangle is:"+2*(l+b));
		return 0;
	}
	
}