/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.singleton.template;

/**
 * 单例模式——懒汉式
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年8月31日  v0.1</p><p>版本内容: 创建</p>
 */
public class Singleton2 {

	private Singleton2(){}
	private static Singleton2 singleton = null;
	public static Singleton2 getInstance(){
		if(singleton==null){
			singleton = new Singleton2();
		}
		return singleton;
	}
}
