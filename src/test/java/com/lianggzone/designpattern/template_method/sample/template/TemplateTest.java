package com.lianggzone.designpattern.template_method.sample.template;

import org.junit.Test;

public class TemplateTest {

	@Test
	public void test(){
		ConcreteClass concreteClass = new ConcreteClass();
		concreteClass.templateMethod();
	}
}