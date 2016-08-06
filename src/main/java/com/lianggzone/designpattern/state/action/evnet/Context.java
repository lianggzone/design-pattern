package com.lianggzone.designpattern.state.action.evnet;

import com.lianggzone.designpattern.state.action.evnet.state.State;

/**
 * Context
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    public void pre(){        
        state.pre(this);
        System.out.println(state.getCurState());
    }
    
    public void next(){
        state.next(this);
        System.out.println(state.getCurState());
    }
    
    public void disconnect(){	
        state.disconnect(this);
        System.out.println(state.getCurState());        
    }
}
