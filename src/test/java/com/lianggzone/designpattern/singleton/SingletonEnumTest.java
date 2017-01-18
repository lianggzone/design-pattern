package com.lianggzone.designpattern.singleton;

import org.junit.Test;

import com.lianggzone.designpattern.singleton.sample.SingletonEnum;

/**
 * 单例模式【枚举】
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月1日  v0.1</p><p>版本内容: 创建</p>
 */
public class SingletonEnumTest {
	
	@Test
	public void getInstance(){
		SingletonEnum s1 = SingletonEnum.Instance;
		SingletonEnum s2 = SingletonEnum.Instance;
		
		System.out.println("实例对象1："+s1.hashCode());
		System.out.println("实例对象2："+s2.hashCode());
		if (s1 ==  s2) {
			System.out.println("实例相等");
		} else {
			System.out.println("实例不等");
		}
	}
}
