package com.chaya.address;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) 
	{
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Customer customer=(Customer) context.getBean("customer");
        customer.display();
	}
}
