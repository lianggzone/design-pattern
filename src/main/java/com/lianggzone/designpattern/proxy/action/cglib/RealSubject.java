/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.proxy.action.cglib;

/**
 * 
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class RealSubject implements Subject {

	@Override
	public void doSomething() {
		System.out.println(" call doSomething. ");   
	}
}
