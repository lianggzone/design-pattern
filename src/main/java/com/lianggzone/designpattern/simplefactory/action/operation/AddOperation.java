/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.simplefactory.action.operation;

/**
 * AddOperation
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月3日  v0.1</p><p>版本内容: 创建</p>
 */
public class AddOperation extends Operation {
	
	@Override
	public double getResult() {
		return x+y;
	}
}
