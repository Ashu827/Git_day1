package com.chaya.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_annotation {
	public static void main(String[] args) {
		
		//this will provide the object using annotation Configuration
   ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
   Samsung s1= context.getBean(Samsung.class);
   s1.config();
   
   
	}
}
