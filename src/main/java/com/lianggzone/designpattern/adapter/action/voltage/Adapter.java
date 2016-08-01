package com.lianggzone.designpattern.adapter.action.voltage;

/**
 * 适配器[继承方式]
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月1日  v0.1</p><p>版本内容: 创建</p>
 */
public class Adapter extends Voltage{
	
	private CurVoltage curVoltage = new CurVoltage();
	
	@Override
	public void getValue(){
		curVoltage.getValue();
	}
}