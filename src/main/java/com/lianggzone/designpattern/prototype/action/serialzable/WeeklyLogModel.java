package com.lianggzone.designpattern.prototype.action.serialzable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

/**
 * 工作周报模型
 * 
 * @author 粱桂钊
 * @since <p>
 *        更新时间: 2016年8月13日 v0.1
 *        </p>
 *        <p>
 *        版本内容: 创建
 *        </p>
 */
public class WeeklyLogModel implements Serializable {
	
	private AttachmentModel attachment;
	private String name;
	private String date;
	private String content;

	public void setAttachment(AttachmentModel attachment) {
		this.attachment = attachment;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public AttachmentModel getAttachment() {
		return (this.attachment);
	}

	public String getName() {
		return (this.name);
	}

	public String getDate() {
		return (this.date);
	}

	public String getContent() {
		return (this.content);
	}

	//使用序列化技术实现深克隆
    public WeeklyLogModel deepClone() throws  IOException, ClassNotFoundException, OptionalDataException{
    	//将对象写入流中
    	ByteArrayOutputStream bao = new ByteArrayOutputStream();
    	ObjectOutputStream oos = new ObjectOutputStream(bao);
    	oos.writeObject(this);

    	//将对象从流中取出
    	ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
    	ObjectInputStream ois = new ObjectInputStream(bis);
    	return (WeeklyLogModel)ois.readObject();
    }
}
