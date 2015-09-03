/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.abstractfactory.action.database2;

/**
 * 简单工厂模式与抽象工厂结合
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月3日  v0.1</p><p>版本内容: 创建</p>
 */
public class DataAccess {
	private static final String db = "MySQL";
	
	public static IUser createUser(){
		IUser result = null;
		switch (db) {
		case "MySQL":
			result = new MySQLUser();
			break;
		case "Oracle":
			result = new OracleUser();
			break;
		default:
			break;
		}
		return result;
	}
	
	public static IRole createRole(){
		IRole result = null;
		switch (db) {
		case "MySQL":
			result = new MySQLRole();
			break;
		case "Oracle":
			result = new OracleRole();
			break;
		default:
			break;
		}
		return result;
	}
}
