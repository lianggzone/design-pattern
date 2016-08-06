package com.lianggzone.designpattern.state;

import org.junit.Test;

import com.lianggzone.designpattern.state.action.color.Context;
import com.lianggzone.designpattern.state.action.color.state.GreenState;

/**
 * ColorTest
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public class ColorTest {

    @Test
    public void test(){
        Context context = new Context();
        context.setState(new GreenState());
        
        context.next();
        context.next();
        context.next();
        context.next();
        context.next();
        context.next();
    }
}
