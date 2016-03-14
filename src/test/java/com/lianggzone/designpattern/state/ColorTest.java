/*
 * Copyright 2013-2016 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.state;

import org.junit.Test;

import com.lianggzone.designpattern.state.action.Context;
import com.lianggzone.designpattern.state.action.GreenState;

/**
 * 状态模式
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public class ColorTest {

    @Test
    public void test(){
        Context context = new Context();
        context.setState(new GreenState());
        context.start();
        context.start();
        context.start();
        context.start();
        context.start();
        context.start();
    }
}
