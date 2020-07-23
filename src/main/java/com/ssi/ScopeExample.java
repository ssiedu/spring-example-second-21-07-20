package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeExample {
	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//Square square=new Square();
		//square.setSide(10);
		/*
		Circle circle=new Circle();		//this object is not going to be managed by spring container so no life cycle methods will work for this object
		circle.setRadius(10);
		circle.computeArea();
		*/
		/*
		System.out.println("Now asking for bean instance ...................");
		Circle circleOne=context.getBean("c1",Circle.class);
		
		System.out.println("Now asking for one more bean instance..............");
		Circle circleTwo=context.getBean("c1",Circle.class);
		
		//Circle circleThree=context.getBean("c1",Circle.class);
		//System.out.println(circleOne==circleTwo);
		*/
		
		
		
	}
}
