package com.lianggzone.designpattern.state.action.evnet.state;

import com.lianggzone.designpattern.state.action.evnet.Context;
import com.lianggzone.designpattern.state.action.evnet.EventEnum;

/**
 * RegistedState
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class RegistedState implements State {
    
    @Override
    public void pre(Context c) {
        c.setState(new RegistingState());
    }

    @Override
    public void next(Context c) {
        //c.setState(new RegistedState());
    }
    
    @Override
	public void disconnect(Context c) {
    	c.setState(new UnconnectState());
	}

    @Override
    public String getCurState() {
        return EventEnum.REGISTED.toString();
    }
}