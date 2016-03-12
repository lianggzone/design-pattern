/*
 * Copyright 2013-2016 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.facade;

import org.junit.Test;

import com.lianggzone.designpattern.facade.template.Facade;

/**
 * 外观模式
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月12日  v0.1</p><p>版本内容: 创建</p>
 */
public class FacadeTest {

	@Test
	public void test(){
		Facade facade = new Facade();
		facade.method();
	}
}
