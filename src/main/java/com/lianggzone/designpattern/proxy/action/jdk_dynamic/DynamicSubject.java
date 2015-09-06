/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.proxy.action.jdk_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class DynamicSubject implements InvocationHandler{

	private Object proxied;
	
	public DynamicSubject(Object proxied){   
	    this.proxied = proxied;   
	}  
	
	/**
	 * 调用方法
	 * @param proxy		被代理的对象
	 * @param method	要调用的方法
	 * @param args		方法调用时所需要的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;  
		
		//在调用具体目标对象之前，可以执行一些功能处理
		System.out.println(" before calling " + method);  
	    
		//转调具体目标对象的方法
		result = method.invoke(proxied, args);  
	    
	    //在调用具体目标对象之后，可以执行一些功能处理
	    System.out.println(" after calling "  + method);
	    
	    return result; 
	}
}