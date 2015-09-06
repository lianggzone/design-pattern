/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.proxy.template;

/**
 * Proxy客户端
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class ProxyClient {
	public static void main(String[] args) {
		// 客户端调用
		RealSubject realSubject = new RealSubject();
		Subject subject = new ProxySubject(realSubject);
		subject.request();
	}
}
