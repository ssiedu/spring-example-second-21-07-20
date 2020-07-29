package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceExample {

	public static void main(String[] args) {
		
		System.out.println("Checking Inheritance.........");
		ApplicationContext context=new ClassPathXmlApplicationContext("info.xml");
		Account ac1=context.getBean("ac1",Account.class);
		Account ac2=context.getBean("ac2",Account.class);
		
		System.out.println(ac1);
		System.out.println(ac2);
	}

}
