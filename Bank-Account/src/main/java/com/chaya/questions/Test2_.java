package com.chaya.questions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2_ 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring2.xml");
		Question question = (Question) context.getBean("questioning");
		System.out.println(question.getQuestionId());
		System.out.println(question.getQuestion());

		for (String s1 : question.getAnswers()) {
			System.out.println(s1);
		}

		System.out.println(question.getQuestionId());
		System.out.println(question.getQuestion());

		for (String s2 : question.getAnswers2()) {
			System.out.println(s2);
		}
		System.out.println(question.getAnswers3());
	}
	}
