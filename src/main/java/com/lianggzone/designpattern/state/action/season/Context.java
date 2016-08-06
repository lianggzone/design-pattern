package com.lianggzone.designpattern.state.action.season;

import com.lianggzone.designpattern.state.action.season.state.SeasonState;
import com.lianggzone.designpattern.state.action.season.state.SpringSeasonState;

/**
 * Context
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class Context {
    
	private int state;
	
    private SeasonState seasonState;
    
    public Context(){
    	seasonState = new SpringSeasonState();
    }
    
    public void execute(){
        this.seasonState.execute(this);
    }

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public SeasonState getSeasonState() {
		return seasonState;
	}

	public void setSeasonState(SeasonState seasonState) {
		this.seasonState = seasonState;
	}
}
