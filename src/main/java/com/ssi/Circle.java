package com.ssi;

public class Circle {
	private double radius, area;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		area=3.14*radius*radius;
	}

	public double getArea() {
		return area;
	}

	
	
}
