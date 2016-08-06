package com.lianggzone.designpattern.state;

import org.junit.Test;

import com.lianggzone.designpattern.state.action.evnet.Context;
import com.lianggzone.designpattern.state.action.evnet.state.UnconnectState;

/**
 * EventTest
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class EventTest {

    @Test
    public void test(){
        Context context = new Context();
        // state[1, UNCONNECT]
        context.setState(new UnconnectState());
        
        // state[2, CONNECT]
        context.next();
        // state[3, REGISTING]
        context.next();
        // state[4, REGISTED]
        context.next();
        // state[4, REGISTED]
        context.next(); 
        
        System.out.println(" >>> ");
        
        // state[3, REGISTING]
        context.pre(); 
        // state[2, CONNECT]
        context.pre(); 
        // state[1, UNCONNECT]
        context.pre(); 
        // state[1, UNCONNECT]
        context.pre(); 
        
        System.out.println(" <<< ");
        context.next(); 
        context.next(); 
        context.disconnect();
        context.next(); 
    }
}
