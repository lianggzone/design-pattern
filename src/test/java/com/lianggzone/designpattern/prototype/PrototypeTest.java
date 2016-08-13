package com.lianggzone.designpattern.prototype;

import org.junit.Test;

import com.lianggzone.designpattern.prototype.template.ConcretePrototype;

/**
 * 客户类
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月13日  v0.1</p><p>版本内容: 创建</p>
 */
public class PrototypeTest {

	@Test
	public void test(){
		ConcretePrototype prototype = new ConcretePrototype();
		prototype.setAttr("LiangGzone");
		
		ConcretePrototype prototype2 = prototype.clone();
		
		System.out.println(prototype.toString());
		System.out.println(prototype2.toString());
	}
}
