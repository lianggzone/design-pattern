package com.lianggzone.designpattern.builder.example.person;

import org.junit.Test;

import com.lianggzone.designpattern.builder.example.person.PersonModel3.Builder;

public class PersonTest {

	@Test
	public void test(){
		PersonModel personModel = new PersonModel();
		personModel.setRealName("梁桂钊");
		personModel.setNickName("LiangGzone");
		personModel.setEmail("lianggzone@163.com");
		personModel.setDomainUrl("http://blog.720ui.com");
		System.out.println(personModel);
	}
	
	@Test
	public void test2(){
		PersonModel2 personModel = new PersonModel2("梁桂钊", "LiangGzone", "lianggzone@163.com", "http://blog.720ui.com");
		System.out.println(personModel);
	}
	
	@Test
	public void test3(){
		Builder builder = new PersonModel3.Builder();
		builder.setRealName("梁桂钊").setNickName("LiangGzone")
				.setEmail("lianggzone@163.com")
				.setDomainUrl("http://blog.720ui.com");
		PersonModel3 personModel = builder.build();
		System.out.println(personModel);
	}
}
