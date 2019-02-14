package com.chaya.questions;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question 
{
String question;
int questionId;
List <String> answers;
public Map answers3;
Set<String> answers2;


public String getQuestion() {
	return question;
}


public void setQuestion(String question) {
	this.question = question;
}


public int getQuestionId() {
	return questionId;
}


public void setQuestionId(int questionId) {
	this.questionId = questionId;
}


public List<String> getAnswers() {
	return answers;
}


public void setAnswers(List<String> answers) {
	this.answers = answers;
}


public Map getAnswers3() {
	return answers3;
}


public void setAnswers3(Map answers3) {
	this.answers3 = answers3;
}


public Set<String> getAnswers2() {
	return answers2;
}


public void setAnswers2(Set<String> answers2) {
	this.answers2 = answers2;
}


public void display()
{
	System.out.println(getAnswers3() +getQuestion()+ getQuestionId()+ getAnswers()+ getAnswers2() );
}
}
