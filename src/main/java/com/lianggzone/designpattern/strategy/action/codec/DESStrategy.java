package com.lianggzone.designpattern.strategy.action.codec;

/**
 * DES
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class DESStrategy extends Strategy {

	@Override
	public void encrypt() {
		System.out.println("DES!");
	}
}
