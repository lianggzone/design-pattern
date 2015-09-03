/*
 * Copyright 2013-2015 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.abstractfactory.action.database3;

/**
 * MySQLUser
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月3日  v0.1</p><p>版本内容: 创建</p>
 */
public class MySQLUser implements IUser{

	@Override
	public void insert() {
		System.out.println("MYSQL数据库插入一条记录！");
	}

}
