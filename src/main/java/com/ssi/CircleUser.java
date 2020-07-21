package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CircleUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we want to have a Circle object (we will get it through Ioc Container)
		
		
		//step-1 (create an instance of ApplicationContext
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//ApplicationContext context=new FileSystemXmlApplicationContext("g:/myconfig/spring.xml");
	
		//step-2 (ask your container to provide you the configured bean object.)
		
		//obtaining the Circle bean
		//Circle circle=(Circle)context.getBean("c1");
		Circle circle=context.getBean("c1",Circle.class);
		System.out.println("Area of Circle : "+circle.getArea());
		
		//obtaining the Square bean
		Square square=context.getBean("s1", Square.class);
		System.out.println("Area of Square : "+square.getArea());
		
		
		
	}

}
