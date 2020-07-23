package com.ssi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestPostProcessor implements BeanPostProcessor {


	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization Is Invoked..........................>>>>>>>>>>>>>>>>>>>");
		return bean;
	}

}
