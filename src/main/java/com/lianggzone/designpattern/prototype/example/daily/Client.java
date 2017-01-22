package com.lianggzone.designpattern.prototype.example.daily;

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
		dailyModel.setAuthor("梁桂钊");
		dailyModel.setContent("2017-01-22 【今日工作要点】");
			
		DailyModel dailyModel2 = dailyModel.clone();
		dailyModel2.setContent("2017-01-23 【今日工作要点】");
		
		System.out.println(dailyModel.toString());
		System.out.println(dailyModel2.toString());
	}
}
