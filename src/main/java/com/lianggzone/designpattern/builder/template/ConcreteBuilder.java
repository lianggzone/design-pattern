package com.lianggzone.designpattern.builder.template;

/**
 * 建造者实现类
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月22日  v0.1</p><p>版本内容: 创建</p>
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

	@Override
	public void buildPartC() {
		System.out.println("buildPartC");
	}
	
}