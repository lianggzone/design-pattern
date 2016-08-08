package com.lianggzone.designpattern.cor;

import org.junit.Test;

import com.lianggzone.designpattern.cor.action.score.Handler;
import com.lianggzone.designpattern.cor.action.score.Handler1;
import com.lianggzone.designpattern.cor.action.score.Handler2;
import com.lianggzone.designpattern.cor.action.score.Handler3;
import com.lianggzone.designpattern.cor.action.score.Handler4;
import com.lianggzone.designpattern.cor.action.score.Handler5;

/**
 * ScoreHandlerTest
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月9日  v0.1</p><p>版本内容: 创建</p>
 */
public class ScoreHandlerTest {

    @Test
    public void test(){
    	// 组装责任链
        Handler handler1 = new Handler1();
        Handler handler2 = new Handler2();
        Handler handler3 = new Handler3();
        Handler handler4 = new Handler4();
        Handler handler5 = new Handler5();
        // 提交请求 
        handler1.addLast(handler2);
        handler2.addLast(handler3);
        handler3.addLast(handler4); 
        handler4.addLast(handler5);
        //模拟请求
        int[] values = {59, 79, 89, 100, 101, 0};
        for (int value : values) {
        	handler1.execute(value);
		}
    }
}
