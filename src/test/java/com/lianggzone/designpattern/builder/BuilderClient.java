package com.lianggzone.designpattern.builder;

import org.junit.Test;

import com.lianggzone.designpattern.builder.template.Builder;
import com.lianggzone.designpattern.builder.template.ConcreteBuilder;
import com.lianggzone.designpattern.builder.template.Director;
import com.lianggzone.designpattern.builder.template.Product;

/**
 * 客户端
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月22日  v0.1</p><p>版本内容: 创建</p>
 */
public class BuilderClient {
    
    @Test
    public void test(){
    	Builder builder = new ConcreteBuilder();
    	Director director = new Director(builder);
    	Product product = director.construct();	
    	System.out.println(product);
	}
}
