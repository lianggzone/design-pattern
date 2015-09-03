/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.abstractfactory.action.database3;

/**
 * 简单工厂模式与抽象工厂结合，并采用反射机制
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月3日  v0.1</p><p>版本内容: 创建</p>
 */
public class DataAccess {
	private static final String db = "MySQL";
	
	public static IUser createUser(){
		String packageName = "com.lianggzone.designpattern.abstractfactory.action.database3.";
		IUser user = null;
		try {
			user = (IUser) Class.forName(packageName+db+"User").newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return user;
	}
	
	public static IRole createRole(){
		String packageName = "com.lianggzone.designpattern.abstractfactory.action.database3.";
		IRole role = null;
		try {
			role = (IRole) Class.forName(packageName+db+"Role").newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return role;
	}
}
