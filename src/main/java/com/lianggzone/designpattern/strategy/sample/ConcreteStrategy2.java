package com.lianggzone.designpattern.strategy.sample;

/**
 * <h3>概要:</h3><p>ConcreteStrategy2</p>
 * <h3>功能:</h3><p>具体的策略</p>
 * <h3>履历:</h3>
 * <li>2017年1月19日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public class ConcreteStrategy2 extends Strategy {
	@Override
	public void execute() {
		System.out.println("StrategyB execute!");
	}
}
