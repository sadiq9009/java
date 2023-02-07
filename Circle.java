package com.Sadiq;



public class Circle implements Geometric {

	double r;
	
  Circle(double r) {
this.r = r;
}

@Override
public double Getarea() {
	System.out.println("The area of circle is:"+Math.PI*r*r);
	return 0;
}

@Override
public double GetPerimeter() {
	System.out.println("The perimeter of circle is:"+2*Math.PI*r*r);
	return 0;
}
	
	
}