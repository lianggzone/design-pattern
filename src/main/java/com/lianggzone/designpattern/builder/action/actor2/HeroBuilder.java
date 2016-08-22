package com.lianggzone.designpattern.builder.action.actor2;

/**
 * 具体建造者
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月22日  v0.1</p><p>版本内容: 创建</p>
 */
public class HeroBuilder extends ActorBuilder {
	
	public void buildType() {
		actor.setType("英雄");
	}

	public void buildSex() {
		actor.setSex("男");
	}

	public void buildFace() {
		actor.setFace("英俊");
	}

	public void buildCostume() {
		actor.setCostume("盔甲");
	}

	public void buildHairstyle() {
		actor.setHairstyle("飘逸");
	}
}