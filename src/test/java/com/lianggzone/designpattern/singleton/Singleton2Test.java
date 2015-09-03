/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.singleton;

import org.junit.Test;

import com.lianggzone.designpattern.singleton.template.Singleton2;

/**
 * 单例模式——懒汉式
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年8月31日  v0.1</p><p>版本内容: 创建</p>
 */
public class Singleton2Test {
	
	@Test
	public void getInstance(){
		Singleton2 s1 = Singleton2.getInstance();
		Singleton2 s2 = Singleton2.getInstance();
		
		System.out.println("实例对象1："+s1.hashCode());
		System.out.println("实例对象2："+s2.hashCode());
		if (s1 ==  s2) {
			System.out.println("实例相等");
		} else {
			System.out.println("实例不等");
		}
	}
}
