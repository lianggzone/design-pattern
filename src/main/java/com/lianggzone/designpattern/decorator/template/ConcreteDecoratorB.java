/*
 * Copyright 2013-2016 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.decorator.template;

/**
 * ConcreteDecoratorA
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public class ConcreteDecoratorB extends Decorator{

    /*
     * ConcreteDecoratorB可以加上新的方法
     */
    
    public ConcreteDecoratorB(Component component) {
        super(component);
        getRemark();
    }
    
    public void getRemark(){
        String remark = "ConcreteDecoratorB 调用！";
        System.out.println(remark);
    }
}
