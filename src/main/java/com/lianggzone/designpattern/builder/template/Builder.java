package com.lianggzone.designpattern.builder.template;

/**
 * 抽象建造者
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月22日  v0.1</p><p>版本内容: 创建</p>
 */
public abstract class Builder {
	
	// 创建产品对象
	protected Product product = new Product();

	public abstract void buildPartA();

	public abstract void buildPartB();

	public abstract void buildPartC();

	// 返回产品对象
	public Product getResult() {
		return this.product;
	}
}