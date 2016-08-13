package com.lianggzone.designpattern.prototype;

import org.junit.Test;

import com.lianggzone.designpattern.prototype.action.clone.PersonModel;

/**
 * 客户类
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月13日  v0.1</p><p>版本内容: 创建</p>
 */
public class CloneTest {

	@Test
	public void test(){
		PersonModel personModel = new PersonModel("LiangGzone", 25);
		
		PersonModel personModel2 = personModel;
		personModel2.setName("Liang");
		
		PersonModel personModel3 = personModel.clone();
		personModel3.setName("Gzone");
		
		System.out.println(personModel.toString());
		System.out.println(personModel2.toString());
		System.out.println(personModel3.toString());
	}
}
