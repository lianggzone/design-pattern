/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.proxy.template;

/**
 * 代理对象
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class ProxySubject implements Subject {

	private Subject realSubject;
	
	public ProxySubject(Subject realSubject)  {
		this.realSubject = realSubject; 
	}
	
	@Override
	public void request() {
		preRequest();
	    realSubject.request();
	    postRequest();
	}
	
	public void preRequest() {
		System.out.println(" start pre-request. ");
	}
	
	public void postRequest() {
		System.out.println(" end post-request. ");
	}

}
