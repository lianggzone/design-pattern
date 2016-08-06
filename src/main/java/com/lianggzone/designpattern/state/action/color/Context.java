package com.lianggzone.designpattern.state.action.color;

import com.lianggzone.designpattern.state.action.color.state.State;

/**
 * Context
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月14日  v0.1</p><p>版本内容: 创建</p>
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    public void next(){
        System.out.println(state.getCurState());
        state.next(this);
    }
}
