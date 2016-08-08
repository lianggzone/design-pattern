package com.lianggzone.designpattern.cor.template;

/**
 * Handler
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月8日  v0.1</p><p>版本内容: 创建</p>
 */
public abstract class Handler {
	
	// 后继的责任对象
	protected Handler handler;
	
	public void addAfter(Handler handler) {
		this.handler = handler;
	}
	
	public abstract void execute(); 
}
