package com.chaya.question;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question 
{
	int questionId;
	String question;
	public Map answer3;
	List<String> answers;
    Set<String>answers1;
	
public Set<String> getAnswers1() {
	return answers1;
}
public void setAnswers1(Set<String> answers1) {
	this.answers1 = answers1;
}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Map getAnswer3()
	{  System.out.println("map: "+answer3);
		return answer3;
	}
	public void setAnswer3(Map answer3) {
		this.answer3 = answer3;
	}
	
}
