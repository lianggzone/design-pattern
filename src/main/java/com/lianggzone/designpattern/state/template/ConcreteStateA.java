/*
 * Copyright 2013-2016 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.state.template;

/**
 * 具体状态(ConcreteState)角色
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月14日  v0.1</p><p>版本内容: 创建</p>
 */
public class ConcreteStateA implements State{

    @Override
    public void handle(String param) {
        System.out.println("ConcreteStateA handle ：" + param);
    }
}
