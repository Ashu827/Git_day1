package com.chaya.bankacc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 
{
 public static void main(String[] args) 
 {
	ApplicationContext context= new ClassPathXmlApplicationContext("Spring3.xml");
	 BankAccountServiceImpl acc = ( BankAccountServiceImpl)context.getBean("account");
	 
	
}
}
