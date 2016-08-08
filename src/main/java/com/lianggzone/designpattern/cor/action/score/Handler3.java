package com.lianggzone.designpattern.cor.action.score;

import com.lianggzone.designpattern.cor.action.score.Handler;

/**
 * Handler2
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月9日  v0.1</p><p>版本内容: 创建</p>
 */
public class Handler3 extends Handler{

	@Override
	public void execute(int value) {
		if(value >= 80 && value < 90){
			System.out.println(value + ",良好");  
		}else{
			this.handler.execute(value);
		}
	}

}
