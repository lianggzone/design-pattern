package com.lianggzone.designpattern.template_method.sample.hock;

/**
 * <h3>概要:</h3><p>AbstractClass</p>
 * <h3>功能:</h3><p>抽象父类</p>
 * <h3>履历:</h3>
 * <li>2016年3月12日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public abstract class AbstractClass {
	
	public final void templateMethod(){
		method1();
		method2();
	}
	
	public void method1(){
		System.out.println("AbstractClass method1 invoke!");
	}
	
	public abstract void method2();
	
	// 这是一个具体的方法，但它什么事情不做
	// 我们可以有默认不做事的方法，我们称这个方法为“钩子”。子类可以视情况覆盖它。
	public void hock(){}
}
