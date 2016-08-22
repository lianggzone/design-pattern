package com.lianggzone.designpattern.builder.action.actor2;

/**
 * 角色类
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月22日  v0.1</p><p>版本内容: 创建</p>
 */
public class Actor {
	private String type; 		// 角色类型
	private String sex; 		// 性别
	private String face; 		// 脸型
	private String costume; 	// 服装
	private String hairstyle; 	// 发型

	public void setType(String type) {
		this.type = type;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public void setCostume(String costume) {
		this.costume = costume;
	}

	public void setHairstyle(String hairstyle) {
		this.hairstyle = hairstyle;
	}

	public String getType() {
		return (this.type);
	}

	public String getSex() {
		return (this.sex);
	}

	public String getFace() {
		return (this.face);
	}

	public String getCostume() {
		return (this.costume);
	}

	public String getHairstyle() {
		return (this.hairstyle);
	}
}