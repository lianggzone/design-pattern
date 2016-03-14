/*
 * Copyright 2013-2016 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.state.template;

/**
 * 抽象状态(State)角色
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月14日  v0.1</p><p>版本内容: 创建</p>
 */
public interface State {

    /*
     * 定义一个接口，用以封装环境（Context）对象的一个特定的状态所对应的行为。
     */
    
    public void handle(String param);
}
