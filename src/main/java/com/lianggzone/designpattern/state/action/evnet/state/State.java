package com.lianggzone.designpattern.state.action.evnet.state;

import com.lianggzone.designpattern.state.action.evnet.Context;

/**
 * State
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月6日  v0.1</p><p>版本内容: 创建</p>
 */
public interface State {
	
    public void pre(Context c);
    
    public void next(Context c);
    
    public void disconnect(Context c);
    
    public String getCurState();
}
