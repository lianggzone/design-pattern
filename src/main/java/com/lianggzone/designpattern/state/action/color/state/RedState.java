package com.lianggzone.designpattern.state.action.color.state;

import com.lianggzone.designpattern.state.action.color.ColorEnum;
import com.lianggzone.designpattern.state.action.color.Context;

/**
 * RedState
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月14日  v0.1</p><p>版本内容: 创建</p>
 */
public class RedState implements State {
    
    @Override
    public void pre(Context c) {
        c.setState(new YellowState());
    }

    @Override
    public void next(Context c) {
        c.setState(new GreenState());
    }

    @Override
    public String getCurState() {
        return ColorEnum.RED.toString();
    }
}
