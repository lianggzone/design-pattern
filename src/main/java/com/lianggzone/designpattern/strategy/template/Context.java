/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.strategy.template;

/**
 * Context
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月2日  v0.1</p><p>版本内容: 创建</p>
 */
public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void doSomething(){
		strategy.doSomething();
	}
	
}
