package com.lianggzone.designpattern.singleton.template;

/**
 * 单例模式【懒汉式  线程安全】
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public class Singleton3 {

    /*
     * 这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading。
     * 但是，遗憾的是，效率很低，99%情况下不需要同步。
     */
    
	private Singleton3(){}
	
	private static Singleton3 singleton = null;
	
	public static synchronized Singleton3 getInstance(){
		if(singleton==null){
			singleton = new Singleton3();
		}
		return singleton;
	}
}
