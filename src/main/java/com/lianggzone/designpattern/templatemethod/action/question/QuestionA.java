package com.lianggzone.designpattern.templatemethod.action.question;

/**
 * QuestionA
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月5日  v0.1</p><p>版本内容: 创建</p>
 */
public class QuestionA extends Question{

	@Override
	public void singleChoice() {
		System.out.println("QuestionA: 单选题");
	}

	@Override
	public void multiChoice() {
		System.out.println("QuestionA: 多选题");
	}
}
