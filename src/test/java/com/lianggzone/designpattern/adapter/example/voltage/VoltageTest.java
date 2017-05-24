package com.lianggzone.designpattern.adapter.example.voltage;

import org.junit.Test;

/**
 * <h3>概要:</h3><p>Client</p>
 * <h3>功能:</h3><p>客户端</p>
 * <h3>履历:</h3>
 * <li>2017年1月23日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public class VoltageTest {
    
    @Test
    public void test1(){
        Adapter adapter = new Adapter();
        adapter.getVoltage(); 
	}
    
    @Test
    public void test2(){
        Adapter2 adapter = new Adapter2();
        adapter.getVoltage(); 
    }
}
