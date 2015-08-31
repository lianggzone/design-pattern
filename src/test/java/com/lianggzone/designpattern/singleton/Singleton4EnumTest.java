/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.singleton;

import org.junit.Test;

/**
 * 单例模式——枚举
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月1日  v0.1</p><p>版本内容: 创建</p>
 */
public class Singleton4EnumTest {
	
	@Test
	public void getInstance(){
		Singleton4Enum s1 = Singleton4Enum.Instance;
		Singleton4Enum s2 = Singleton4Enum.Instance;
		
		System.out.println("实例对象1："+s1.hashCode());
		System.out.println("实例对象2："+s2.hashCode());
		if (s1 ==  s2) {
			System.out.println("实例相等");
		} else {
			System.out.println("实例不等");
		}
	}
}
