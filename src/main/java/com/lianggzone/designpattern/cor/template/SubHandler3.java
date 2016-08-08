package com.lianggzone.designpattern.cor.template;

/**
 * Handler实现类
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月8日  v0.1</p><p>版本内容: 创建</p>
 */
public class SubHandler3 extends Handler{
	
	
	public void execute(){
		System.out.println("SubHandler3");
		
		if(this.handler != null){
			this.handler.execute();
		}
	}
}
