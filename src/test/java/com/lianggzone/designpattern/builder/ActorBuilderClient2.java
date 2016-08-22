package com.lianggzone.designpattern.builder;

import org.junit.Test;

import com.lianggzone.designpattern.builder.action.actor2.Actor;
import com.lianggzone.designpattern.builder.action.actor2.ActorBuilder;
import com.lianggzone.designpattern.builder.action.actor2.HeroBuilder;

/**
 * 客户端
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月22日  v0.1</p><p>版本内容: 创建</p>
 */
public class ActorBuilderClient2 {
    
    @Test
    public void test(){
    	ActorBuilder builder = new HeroBuilder();
    	Actor actor = builder.construct();	
    	System.out.println(actor.getFace());
	}
}
