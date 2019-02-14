package com.chaya.question;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 
{
 public static void main(String[] args) 
 {
	 ApplicationContext context =new ClassPathXmlApplicationContext("Spring2.xml");
     
     Question question= (Question) context.getBean("question1");
    System.out.println( question.getQuestionId());
System.out.println(question.getQuestion());
     
     
     for(String s: question.getAnswers())
     {
    	 System.out.println(s);
     }
    
    System.out.println(question.getQuestion());
     for(String a: question.getAnswers1())
     {
    	 System.out.println(a);
     }
     
     question.getAnswer3();
 }
}
