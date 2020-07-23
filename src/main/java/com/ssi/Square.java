package com.ssi;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Square implements InitializingBean, DisposableBean {
	private int side, area;

	public void start() {
		System.out.println("Start Method of Square ...............");
	}
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		System.out.println("Setting the side property of square........");
		this.side = side;

	}

	public int getArea() {
		return area;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Computing area after property set .... ");
		area = side * side;
		System.out.println("Area of Square : "+area);
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//code to be executed on disposal of bean instance
	}

}
