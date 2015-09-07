/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.chain.template;

/**
 * 客户端
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月7日  v0.1</p><p>版本内容: 创建</p>
 */
public class ChainClient {
	public static void main(String[] args) {
		// 组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        // 提交请求
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        
        //模拟请求
        int[] params = {5, 10, 90, 50};
        for (int i : params) {
        	handler1.handleRequest(i);
		}
	}
}
