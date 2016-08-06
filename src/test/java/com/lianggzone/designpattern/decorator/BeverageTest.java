package com.lianggzone.designpattern.decorator;

import org.junit.Test;

import com.lianggzone.designpattern.decorator.action.beverage.Beverage;
import com.lianggzone.designpattern.decorator.action.beverage.Coffer;
import com.lianggzone.designpattern.decorator.action.beverage.CofferBean;
import com.lianggzone.designpattern.decorator.action.beverage.Milk;
import com.lianggzone.designpattern.decorator.action.beverage.Water;

/**
 * 
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public class BeverageTest {

    @Test
    public void test(){
        Beverage beverage = new Coffer();
        beverage = new Milk(beverage);
        beverage = new CofferBean(beverage);
        beverage = new Water(beverage);

        System.out.println(beverage.getName());
        System.out.println(beverage.getCost());
    }
}
