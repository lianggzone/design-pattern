/*
 * Copyright 2013-2016 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.template.template;

/**
 * 
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月12日  v0.1</p><p>版本内容: 创建</p>
 */
public abstract class AbstractClass {
	public final void templateMethod(){
		method1();
		method2();
		hock();
	}
	
	public void method1(){
		System.out.println("AbstractClass method1 invoke!");
	}
	
	public abstract void method2();
	
	// 这是一个具体的方法，但它什么事情不做
	// 我们可以有默认不做事的方法，我们称这个方法为“钩子”。子类可以视情况覆盖它。
	public void hock(){}
}
