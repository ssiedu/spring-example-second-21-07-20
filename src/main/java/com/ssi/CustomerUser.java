package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerUser {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Customer c1=context.getBean("cust1",Customer.class);
		System.out.println(c1);
	}

}
