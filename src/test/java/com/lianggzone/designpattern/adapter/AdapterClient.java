package com.lianggzone.designpattern.adapter;

import org.junit.Test;

import com.lianggzone.designpattern.adapter.template.Adapter;
import com.lianggzone.designpattern.adapter.template.Target;

/**
 * 客户端
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class AdapterClient {
    
    @Test
    public void test(){
		Target target = new Adapter();
		target.request();		
	}
}
