package com.lianggzone.designpattern.singleton.example;

import org.junit.Test;

import com.lianggzone.designpattern.singleton.example.counter.Counter;

public class CounterTest {

	@Test
	public void plus(){
		Counter counter = Counter.getInstance();
		System.out.println(counter.plus());
		System.out.println(counter.plus());
		System.out.println(counter.plus());
		System.out.println(counter.plus());
		System.out.println(counter.plus());
	}
}
