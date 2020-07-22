package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeExample {
	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Now asking for bean instance ...................");
		Circle circleOne=context.getBean("c1",Circle.class);
		
		/*
		System.out.println("Now asking for one more bean instance..............");
		Circle circleTwo=context.getBean("c1",Circle.class);
		//Circle circleThree=context.getBean("c1",Circle.class);
		//System.out.println(circleOne==circleTwo);
		*/
		
		
	}
}
