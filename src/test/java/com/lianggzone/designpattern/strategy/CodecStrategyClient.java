package com.lianggzone.designpattern.strategy;

import org.junit.Test;

import com.lianggzone.designpattern.strategy.action.codec.Context;
import com.lianggzone.designpattern.strategy.action.codec.DESStrategy;
import com.lianggzone.designpattern.strategy.action.codec.MD5Strategy;

/**
 * 客户端
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class CodecStrategyClient {
	
	@Test
    public void test(){
	    Context context = new Context(new MD5Strategy());
        context.encrypt();
        
        Context context2 = new Context(new DESStrategy());
        context2.encrypt();
    }
}
