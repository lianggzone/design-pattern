package com.lianggzone.designpattern.strategy.action.codec;

/**
 * Context
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void encrypt(){
		strategy.encrypt();;
	}
	
}
