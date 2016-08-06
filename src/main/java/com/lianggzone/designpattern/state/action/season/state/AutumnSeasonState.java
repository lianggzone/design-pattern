package com.lianggzone.designpattern.state.action.season.state;

import com.lianggzone.designpattern.state.action.season.Context;
import com.lianggzone.designpattern.state.action.season.SeasonStatusConstant;

/**
 * AutumnSeasonState
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月6日  v0.1</p><p>版本内容: 创建</p>
 */
public class AutumnSeasonState implements SeasonState{

	@Override
	public void execute(Context context) {
		if(context.getState() == SeasonStatusConstant.AUTUMN){
			System.out.println("AUTUMN ");
		}else{
			context.setSeasonState(new WinterSeasonState());
			context.execute();
		}
	}

}
