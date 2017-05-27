package com.lianggzone.designpattern.singleton.example;

import org.junit.Test;

import com.lianggzone.designpattern.singleton.example.resource.Resource;

public class ResourceTest {

	@Test
	public void test(){
	    for (int i = 1; i < 10; i++) {
	        Resource resource = Resource.getInstance(i % 2);
	        System.out.println(resource );
        }
	    
	}
}   
