/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.strategy.template;

/**
 * 客户端
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月2日  v0.1</p><p>版本内容: 创建</p>
 */
public class StrategyClient {
	public static void main(String[] args) {
		Context context = new Context(new StrategyA());
		context.doSomething();
		
		Context context2 = new Context(new StrategyB());
		context2.doSomething();
	}
}
