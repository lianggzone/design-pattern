package com.lianggzone.designpattern.template_method.example.question;

public class Client {

	public static void main(String[] args) {
		Question question1 = new QuestionA();
		question1.make();
		
		Question question2 = new QuestionB();
		question2.make();
	}
}
