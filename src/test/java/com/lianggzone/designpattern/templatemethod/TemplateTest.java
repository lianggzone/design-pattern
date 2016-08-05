package com.lianggzone.designpattern.templatemethod;

import org.junit.Test;

import com.lianggzone.designpattern.templatemethod.template.SubClass1;
import com.lianggzone.designpattern.templatemethod.template.SubClass2;

/**
 * 模板方法模式
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月12日  v0.1</p><p>版本内容: 创建</p>
 */
public class TemplateTest {

	@Test
	public void test(){
		SubClass1 subClass1 = new SubClass1();
		subClass1.templateMethod();

		SubClass2 subClass2 = new SubClass2();
		subClass2.templateMethod();
	}
}
