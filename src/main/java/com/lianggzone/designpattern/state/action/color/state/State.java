package com.lianggzone.designpattern.state.action.color.state;

import com.lianggzone.designpattern.state.action.color.Context;

/**
 * State
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月14日  v0.1</p><p>版本内容: 创建</p>
 */
public interface State {
	
    public void pre(Context c);
    
    public void next(Context c);
    
    public String getCurState();
}
