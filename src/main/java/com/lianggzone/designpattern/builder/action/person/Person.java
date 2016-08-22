package com.lianggzone.designpattern.builder.action.person;

/**
 * 人
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月22日  v0.1</p><p>版本内容: 创建</p>
 */
public class Person {

	private String name;
	private int age;
	private String sex;
	
	public static class Builder {
		private String name;
		private int age;
		private String sex;
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public Builder setSex(String sex) {
			this.sex = sex;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}
	
	/**
	 * @param name
	 * @param age
	 * @param sex
	 */
	public Person(Builder builder) {
		name = builder.name;
		age = builder.age;
		sex = builder.sex;
	}

	@Override
	public String toString() {
		return "name: "+name+" ,age: "+age+", sex: "+sex;
	}
}
