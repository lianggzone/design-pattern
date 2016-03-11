/*
 * Copyright 2013-2016 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.decorator;

import org.junit.Test;

import com.lianggzone.designpattern.decorator.template.Component;
import com.lianggzone.designpattern.decorator.template.ConcreteComponent;
import com.lianggzone.designpattern.decorator.template.ConcreteDecoratorA;
import com.lianggzone.designpattern.decorator.template.ConcreteDecoratorB;

/**
 * 装饰者模式
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public class DecoratorTest {
	
	@Test
	public void test(){
	    Component component = new ConcreteComponent();
	    
	    ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
	    concreteDecoratorA.methodA();
	    
	    ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);
	    concreteDecoratorB.methodA();
	}
}
