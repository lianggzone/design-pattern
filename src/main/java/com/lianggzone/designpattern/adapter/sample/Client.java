package com.lianggzone.designpattern.adapter.sample;

import org.junit.Test;

/**
 * <h3>概要:</h3><p>Client</p>
 * <h3>功能:</h3><p>客户端</p>
 * <h3>履历:</h3>
 * <li>2017年1月23日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public class Client {
    
    @Test
    public void test(){
		Target target = new Adapter();
		target.request();		
	}
}
