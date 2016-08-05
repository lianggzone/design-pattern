package com.lianggzone.designpattern.templatemethod.action.question;

/**
 * QuestionB
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月5日  v0.1</p><p>版本内容: 创建</p>
 */
public class QuestionB extends Question{

	@Override
	public void singleChoice() {
		System.out.println("QuestionB: 单选题");
	}

	@Override
	public void multiChoice() {
		System.out.println("QuestionB: 多选题");
	}
	
	@Override
	public void hock() {
		System.out.println("QuestionB: 判断题");
		System.out.println("QuestionB: 问答题");
	}
}
