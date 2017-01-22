package com.lianggzone.designpattern.builder.sample;

/** 
 * <h3>概要:</h3><p>ConcreteBuilder</p>
 * <h3>功能:</h3><p>建造者实现类</p>
 * <h3>履历:</h3>
 * <li>2017年1月22日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public class ConcreteBuilder extends Builder{

	@Override
	public void buildPartA() {
		System.out.println("buildPartA");
	}

	@Override
	public void buildPartB() {
		System.out.println("buildPartB");
	}
}