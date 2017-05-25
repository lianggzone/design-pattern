package com.lianggzone.designpattern.template_method.example.question;

import org.junit.Test;

public class QuestionTest {

	@Test
	public void test(){
		Question question1 = new QuestionA();
		question1.make();
		
		Question question2 = new QuestionB();
		question2.make();
	}
}
