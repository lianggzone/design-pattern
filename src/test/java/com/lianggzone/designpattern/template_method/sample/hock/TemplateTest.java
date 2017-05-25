package com.lianggzone.designpattern.template_method.sample.hock;

import org.junit.Test;

public class TemplateTest {

	@Test
	public void test(){
		SubClass1 subClass1 = new SubClass1();
		subClass1.templateMethod();

		SubClass2 subClass2 = new SubClass2();
		subClass2.templateMethod();
	}
}