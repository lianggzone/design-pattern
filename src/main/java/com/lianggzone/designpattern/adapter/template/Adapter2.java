package com.lianggzone.designpattern.adapter.template;


/**
 * 适配器
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class Adapter2{
	
	private Adaptee adaptee;
	
	public Adapter2(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	public void request(){
		adaptee.specRequest();
	}
}
