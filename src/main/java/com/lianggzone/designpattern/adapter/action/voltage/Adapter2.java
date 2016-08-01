package com.lianggzone.designpattern.adapter.action.voltage;

/**
 * 适配器[组合方式]
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月1日  v0.1</p><p>版本内容: 创建</p>
 */
public class Adapter2{
	
	private CurVoltage curVoltage;

	public Adapter2(CurVoltage curVoltage) {
		this.curVoltage = curVoltage;
	}

	public void getValue(){
		curVoltage.getValue();
	}
}
