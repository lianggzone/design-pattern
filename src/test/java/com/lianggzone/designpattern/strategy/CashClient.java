package com.lianggzone.designpattern.strategy;

import org.junit.Test;

import com.lianggzone.designpattern.strategy.action.promotion.CashContext;
import com.lianggzone.designpattern.strategy.action.promotion.HalfCashStrategy;

/**
 * CashClient
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2015年9月2日  v0.1</p><p>版本内容: 创建</p>
 */
public class CashClient {

    @Test
    public void test(){
		CashContext cash = new CashContext(new HalfCashStrategy());
		cash.promotion();
	}
}
