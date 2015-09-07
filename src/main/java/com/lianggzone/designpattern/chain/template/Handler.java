/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.chain.template;

/**
 * 抽象处理者角色
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月7日  v0.1</p><p>版本内容: 创建</p>
 */
public abstract class Handler {

	// 后继的责任对象
	protected Handler successor;
	
	/**
	 * 设置后继的责任对象
	 * @param successor
	 */
	public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
	
	public abstract void handleRequest(int param);
}
