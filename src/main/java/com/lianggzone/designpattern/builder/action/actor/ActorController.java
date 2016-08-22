package com.lianggzone.designpattern.builder.action.actor;

/**
 * 角色创建控制器：指挥者
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月22日  v0.1</p><p>版本内容: 创建</p>
 */
public class ActorController {
	// 逐步构建复杂产品对象
	public Actor construct(ActorBuilder ab) {
		
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		ab.buildHairstyle();
		return ab.createActor();
	}
}