package com.lianggzone.designpattern.strategy.action.duck;

/**
 * NormalDuck
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月15日  v0.1</p><p>版本内容: 创建</p>
 */
public class NormalDuck extends Duck{

    @Override
    public void fly() {
        System.out.println("我是禽鸭，我会飞！");
    }
}
