package com.lianggzone.designpattern.prototype.action.serialzable;

import java.io.Serializable;

/**
 * 附件模型
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月13日  v0.1</p><p>版本内容: 创建</p>
 */
@SuppressWarnings("serial")
public class AttachmentModel implements Serializable{

	private String name;
	
	public AttachmentModel() {}
	public AttachmentModel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuffer content = new StringBuffer();
		content.append("Attachment[");
		content.append("name = ").append(this.name).append("] ");
		return content.toString();
	}
	
	
}
