package com.lianggzone.designpattern.singleton.sample;

import org.junit.Test;

public class SingletonTest {
	
	@Test
    public void getInstance(){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        
        System.out.println("实例对象1：" + s1.hashCode());
        System.out.println("实例对象2：" + s2.hashCode());
        if (s1 ==  s2) {
            System.out.println("实例相等");
        } else {
            System.out.println("实例不等");
        }
    }
}
