package com.lianggzone.designpattern.builder.action.actor2;

/**
 * 抽象建造者
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月22日  v0.1</p><p>版本内容: 创建</p>
 */
public abstract class ActorBuilder {
	
	protected Actor actor = new Actor();

	public abstract void buildType();

	public abstract void buildSex();

	public abstract void buildFace();

	public abstract void buildCostume();

	public abstract void buildHairstyle();
	
	public Actor construct() {	
		this.buildType();
		this.buildSex();
		this.buildFace();
		this.buildCostume();
		this.buildHairstyle();
		return actor;
	}
}