package com.lianggzone.designpattern.singleton.action;

/**
 * 单例模式
 * 案例: 累加器
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月1日  v0.1</p><p>版本内容: 创建</p>
 */
public class Counter {

	private Counter(){}
	
	private long count = 0;
	private static Counter counter = new Counter();
	
	public static Counter getInstance(){
		return counter;
	}
	
	public synchronized long plus(){
		return ++count;
	}
}
