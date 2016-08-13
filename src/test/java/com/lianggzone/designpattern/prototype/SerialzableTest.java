package com.lianggzone.designpattern.prototype;

import org.junit.Test;

import com.lianggzone.designpattern.prototype.action.serialzable.AttachmentModel;
import com.lianggzone.designpattern.prototype.action.serialzable.WeeklyLogModel;

/**
 * 客户类
 * 
 * @author 粱桂钊
 * @since <p>
 *        更新时间: 2016年8月13日 v0.1
 *        </p>
 *        <p>
 *        版本内容: 创建
 *        </p>
 */
public class SerialzableTest {

	@Test
	public void test() {
		WeeklyLogModel logPrevious = null;
		WeeklyLogModel logNew = null;
		
		// 创建原型对象
		logPrevious = new WeeklyLogModel(); 
		
		// 创建附件对象
		AttachmentModel attachment = new AttachmentModel(); 
		logPrevious.setAttachment(attachment); 
		
		try {
			// 调用深克隆方法创建克隆对象
			logNew = logPrevious.deepClone(); 
		} catch (Exception e) {
			System.err.println("克隆失败！");
		}
		// 比较周报
		System.out.println("周报是否相同？ " + (logPrevious == logNew));
		// 比较附件
		System.out.println("附件是否相同？ " + (logPrevious.getAttachment() == logNew.getAttachment()));
	}
}
