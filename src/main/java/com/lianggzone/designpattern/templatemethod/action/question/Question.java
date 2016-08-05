package com.lianggzone.designpattern.templatemethod.action.question;

/**
 * Question
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月5日  v0.1</p><p>版本内容: 创建</p>
 */
public abstract class Question {
	
	public final void make(){
		singleChoice();
		multiChoice();
		hock();
	}
	
	public abstract void singleChoice();
	public abstract void multiChoice();
	public void hock(){}
}
