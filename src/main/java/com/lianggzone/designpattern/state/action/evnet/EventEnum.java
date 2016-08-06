package com.lianggzone.designpattern.state.action.evnet;

/**
 * EventEnum
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月6日  v0.1</p><p>版本内容: 创建</p>
 */
public enum EventEnum {
	
	// 未连接
	UNCONNECT(1, "UNCONNECT"), 
	// 已连接
	CONNECT(2, "CONNECT"), 
	// 注册中
	REGISTING(3, "REGISTING"), 
	// 已注册
	REGISTED(4, "REGISTED");
    
	private int key;
	private String value;

    EventEnum(int key, String value) {
    	this.key = key;
        this.value = value;
    }

	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "state["+ key +", " + value + "]";
	}
}
