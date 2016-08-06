package com.lianggzone.designpattern.decorator.action.beverage;

/**
 * Water
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public class Water extends Decorator{

    private Beverage beverage;

    private static final int cost = 1;
    private static final String name = " 水";
    
    public Water(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    @Override
    public String getName() {
        return name + beverage.getName();
    }

    @Override
    public double getCost() {
        return cost + beverage.getCost();
    }
}