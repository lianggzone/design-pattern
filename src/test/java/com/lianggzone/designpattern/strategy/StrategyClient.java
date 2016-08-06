package com.lianggzone.designpattern.strategy;

import org.junit.Test;

import com.lianggzone.designpattern.strategy.template.Context;
import com.lianggzone.designpattern.strategy.template.StrategyA;
import com.lianggzone.designpattern.strategy.template.StrategyB;

/**
 * 客户端
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月2日  v0.1</p><p>版本内容: 创建</p>
 */
public class StrategyClient {
	
	@Test
    public void test(){
	    Context context = new Context(new StrategyA());
        context.execute();
        
        Context context2 = new Context(new StrategyB());
        context2.execute();
    }
}
