/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.factory.action.operation;

/**
 * Operation
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月3日  v0.1</p><p>版本内容: 创建</p>
 */
public abstract class Operation {
	protected double x;
	protected double y;

	public abstract double getResult();
	
	/**
	 * @return 获取 x
	 */
	public double getX() {
		return x;
	}
	/**
	 * @param x 设置 x
	 */
	public void setX(double x) {
		this.x = x;
	}
	/**
	 * @return 获取 y
	 */
	public double getY() {
		return y;
	}
	/**
	 * @param y 设置 y
	 */
	public void setY(double y) {
		this.y = y;
	}
}
