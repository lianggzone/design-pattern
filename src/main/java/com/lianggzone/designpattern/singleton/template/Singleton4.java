package com.lianggzone.designpattern.singleton.template;

/**
 * 单例模式【双重检验锁】
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public class Singleton4 {

	private Singleton4(){}
	
	private static Singleton4 singleton = null;
	
	public static Singleton4 getInstance(){
		if(singleton==null){
		    synchronized(Singleton4.class){
		        if(singleton==null){
		            singleton = new Singleton4();
		        }
		    }	
		}
		return singleton;
	}
}
