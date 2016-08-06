package com.lianggzone.designpattern.decorator.action.beverage;

/**
 * CofferBean
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public class CofferBean extends Decorator{

	private static final int cost = 5;
    private static final String name = " 大豆";
	
    private Beverage beverage;

    public CofferBean(Beverage beverage) {
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