package com.lianggzone.designpattern.state;

import org.junit.Test;

import com.lianggzone.designpattern.state.template.ConcreteStateA;
import com.lianggzone.designpattern.state.template.Context;
import com.lianggzone.designpattern.state.template.State;

/**
 * 状态模式
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public class StateTest {

    @Test
    public void test(){
        State state = new ConcreteStateA();
        Context context = new Context(state);
        context.request("a");
    }
}
