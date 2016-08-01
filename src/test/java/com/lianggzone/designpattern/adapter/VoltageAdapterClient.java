package com.lianggzone.designpattern.adapter;

import org.junit.Test;

import com.lianggzone.designpattern.adapter.action.voltage.Adapter;
import com.lianggzone.designpattern.adapter.action.voltage.Adapter2;
import com.lianggzone.designpattern.adapter.action.voltage.CurVoltage;
import com.lianggzone.designpattern.adapter.action.voltage.Voltage;

/**
 * 客户端
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月1日  v0.1</p><p>版本内容: 创建</p>
 */
public class VoltageAdapterClient {
    
    @Test
    public void test1(){
    	Voltage voltage = new Adapter();
    	voltage.getValue();		
	}
    
    @Test
    public void test2(){
    	Adapter2 voltage = new Adapter2(new CurVoltage());
    	voltage.getValue();		
	}
}
