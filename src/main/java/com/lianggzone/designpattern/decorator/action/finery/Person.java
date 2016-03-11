/*
 * Copyright 2013-2016 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.decorator.action.finery;

/**
 * 人 模型
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public class Person {

    private String name;
    
    public Person(){}
    public Person(String name) {
        this.name = name;
        System.out.print(name+",穿着：");
    }

    public void show(){
        System.out.println();
        System.out.println("今天打扮的不错哟~");
    }
}
