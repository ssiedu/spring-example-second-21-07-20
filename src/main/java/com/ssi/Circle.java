package com.ssi;

public class Circle {
	private double radius, area;

	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		System.out.println("Setting The Value of Radius.........");
		this.radius = radius;
	}
	public void computeArea() {
		System.out.println("Now Computing Area.........");
		area=3.14*radius*radius;
		System.out.println("Area of Circle Is : "+area);
	}

	public double getArea() {
		return area;
	}

	
	
}
