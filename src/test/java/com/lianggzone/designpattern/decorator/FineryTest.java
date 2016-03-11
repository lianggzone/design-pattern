/*
 * Copyright 2013-2016 lianggzone all rights reserved.
 * @license http://www.lianggzone.com/about
 */
package com.lianggzone.designpattern.decorator;

import org.junit.Test;

import com.lianggzone.designpattern.decorator.action.finery.Clothes;
import com.lianggzone.designpattern.decorator.action.finery.Pants;
import com.lianggzone.designpattern.decorator.action.finery.Person;
import com.lianggzone.designpattern.decorator.action.finery.Shoe;

/**
 * 
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public class FineryTest {

    @Test
    public void test(){
        Person person = new Person("梁桂钊");
        
        Clothes clothes = new Clothes(person);
        Pants pants = new Pants(clothes);
        Shoe shoe = new Shoe(pants);
        
        shoe.show();
    }
}
