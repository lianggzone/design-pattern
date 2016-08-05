package com.lianggzone.designpattern.templatemethod;

import org.junit.Test;

import com.lianggzone.designpattern.templatemethod.action.question.Question;
import com.lianggzone.designpattern.templatemethod.action.question.QuestionA;
import com.lianggzone.designpattern.templatemethod.action.question.QuestionB;

/**
 * 模板方法模式
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月12日  v0.1</p><p>版本内容: 创建</p>
 */
public class QuestionTest {

	@Test
	public void test(){
		Question question1 = new QuestionA();
		question1.make();
		
		System.out.println(" === ");

		Question question2 = new QuestionB();
		question2.make();
	}
}
