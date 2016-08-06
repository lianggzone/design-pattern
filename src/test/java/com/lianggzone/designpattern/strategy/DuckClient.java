package com.lianggzone.designpattern.strategy;

import org.junit.Test;

import com.lianggzone.designpattern.strategy.action.duck.Context;
import com.lianggzone.designpattern.strategy.action.duck.NormalDuck;
import com.lianggzone.designpattern.strategy.action.duck.RubberDuck;

/**
 * CashClient
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月2日  v0.1</p><p>版本内容: 创建</p>
 */
public class DuckClient {

    @Test
    public void test(){
		Context context = new Context(new RubberDuck());
		context.fly();
		
		context = new Context(new NormalDuck());
		context.fly();
	}
}
