package com.lianggzone.designpattern.prototype.example.daily2;

import org.junit.Test;

/**
 * <h3>概要:</h3><p>Client</p>
 * <h3>功能:</h3><p>客户类</p>
 * <h3>履历:</h3>
 * <li>2017年1月22日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public class Client {

	public static void main(String[] args) {
		DailyModel dailyModel = new DailyModel(); 		
		DailyModel dailyModel2 = null;
		// 创建附件对象
		AttachmentModel attachment = new AttachmentModel(); 
		attachment.setName("附件");
		dailyModel.setAttachment(attachment); 
		
		try {
			// 调用深克隆方法创建克隆对象
			dailyModel2 = dailyModel.deepClone(); 
		} catch (Exception e) {
			System.err.println("克隆失败！");
		}
		
		System.out.println("日报是否相同？ " + (dailyModel == dailyModel2));
		System.out.println("附件是否相同？ " + (dailyModel.getAttachment() == dailyModel2.getAttachment()));
	}
}
