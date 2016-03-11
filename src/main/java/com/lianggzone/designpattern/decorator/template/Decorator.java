/*
 * Copyright 2013-2016 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.decorator.template;

/**
 * Decorator
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public abstract class Decorator extends Component{

    /*
     * 这个是装饰者共同实现的接口
     */
    
    private Component component;
    
    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void methodA() {
        if(component!=null){
            component.methodA();
        }
    }
}
