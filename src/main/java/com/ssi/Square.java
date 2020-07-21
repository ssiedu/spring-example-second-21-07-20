package com.ssi;

public class Square {
	private int side, area;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
		area=side*side;
	}

	public int getArea() {
		return area;
	}

	
}
