/*
 * Copyright 2013-2016 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.facade.template;

/**
 * 
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月12日  v0.1</p><p>版本内容: 创建</p>
 */
public class Facade {
	
	public void method(){
		Klass1 klass1 = new Klass1();
		klass1.method1();
		
		Klass2 klass2 = new Klass2();
		klass2.method2();
	}
}
