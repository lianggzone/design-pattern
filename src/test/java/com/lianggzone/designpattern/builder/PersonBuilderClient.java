package com.lianggzone.designpattern.builder;

import org.junit.Test;

import com.lianggzone.designpattern.builder.action.person.Person;

/**
 * 客户端
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月22日  v0.1</p><p>版本内容: 创建</p>
 */
public class PersonBuilderClient {
    
    @Test
    public void test(){
    	Person.Builder builder = new Person.Builder();
    	builder.setName("LiangGzone").setAge(25).setSex("男");
    	
    	System.out.println(new Person(builder).toString());
    	
    	System.out.println(builder.build().toString());
    }
}
