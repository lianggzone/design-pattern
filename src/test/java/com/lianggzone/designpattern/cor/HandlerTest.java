package com.lianggzone.designpattern.cor;

import org.junit.Test;

import com.lianggzone.designpattern.cor.template.Handler;
import com.lianggzone.designpattern.cor.template.SubHandler1;
import com.lianggzone.designpattern.cor.template.SubHandler2;
import com.lianggzone.designpattern.cor.template.SubHandler3;

/**
 * HandlerTest
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月9日  v0.1</p><p>版本内容: 创建</p>
 */
public class HandlerTest {

    @Test
    public void test(){
    	Handler handler1 = new SubHandler1();
    	Handler handler2 = new SubHandler2();
    	Handler handler3 = new SubHandler3();
    	
    	handler1.addAfter(handler2);
    	handler2.addAfter(handler3);
    	
    	handler1.execute();
    }
}
