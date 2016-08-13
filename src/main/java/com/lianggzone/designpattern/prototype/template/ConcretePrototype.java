package com.lianggzone.designpattern.prototype.template;

/**
 * 具体原型类
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月13日  v0.1</p><p>版本内容: 创建</p>
 */
public class ConcretePrototype implements Prototype{
	
	private String attr; // 成员属性
	
	public void setAttr(String attr){
		this.attr = attr;
	}
	
	public String getAttr(){
		return this.attr;
	}
	
	/**
	 * 克隆方法
	 */
	@Override
	public ConcretePrototype clone() {
		// 创建新对象
		ConcretePrototype prototype = new ConcretePrototype(); 
		prototype.setAttr(this.attr);
		return prototype;
	}

	@Override
	public String toString() {
		return "ConcretePrototype[attr="+this.attr+"]";
	}
	
	
}
