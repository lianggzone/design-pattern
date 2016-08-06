package com.lianggzone.designpattern.state;

import org.junit.Test;

import com.lianggzone.designpattern.state.action.season.Context;

/**
 * SeasonTest
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class SeasonTest {

    @Test
    public void test(){
        Context context = new Context();   
        
        context.setState(1);
        context.execute();
        
        context.setState(2);
        context.execute();
        
        context.setState(3);
        context.execute();
        
        context.setState(4);
        context.execute();
        
        context.setState(5);
        context.execute();
        
        context.setState(6);
        context.execute();
        
    }
}
