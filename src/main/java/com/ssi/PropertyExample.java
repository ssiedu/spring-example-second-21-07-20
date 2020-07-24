package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyExample {
	public static void main(String arg[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Emp emp1=context.getBean("e1",Emp.class);
		Emp emp2=context.getBean("e2",Emp.class);
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
