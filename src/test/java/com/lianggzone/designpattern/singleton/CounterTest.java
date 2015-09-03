/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.singleton;

import org.junit.Test;

import com.lianggzone.designpattern.singleton.action.counter.Counter;

/**
 * 单例模式——案例(累加器)
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月1日  v0.1</p><p>版本内容: 创建</p>
 */
public class CounterTest {

	@Test
	public void plus(){
		Counter counter = Counter.getInstance();
		System.out.println(counter.plus());
		System.out.println(counter.plus());
		System.out.println(counter.plus());
		System.out.println(counter.plus());
		System.out.println(counter.plus());
	}
}
