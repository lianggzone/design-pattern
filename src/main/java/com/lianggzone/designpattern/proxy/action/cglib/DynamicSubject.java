/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.proxy.action.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class DynamicSubject implements MethodInterceptor{

	private Object target;
	
	public Object getInstance(Object target) {  
        this.target = target;  
        Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(this.target.getClass());  
        enhancer.setCallback(this);  
        return enhancer.create();	// 创建代理对象  
    }

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		Object result = null;  
		
		//在调用具体目标对象之前，可以执行一些功能处理
		System.out.println(" before calling " + method);  
	    
		//转调具体目标对象的方法
		result = proxy.invokeSuper(obj, args);  
	    
	    //在调用具体目标对象之后，可以执行一些功能处理
	    System.out.println(" after calling "  + method);
	    
	    return result; 
	}  
	
}