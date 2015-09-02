/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.strategy.action.promotion;

/**
 * CashContext
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月2日  v0.1</p><p>版本内容: 创建</p>
 */
public class CashContext {

	private CashStrategy cashStrategy;

	public CashContext(CashStrategy cashStrategy) {
		this.cashStrategy = cashStrategy;
	}
	
	public void promotion() {
		this.cashStrategy.promotion();
	}
	
}
