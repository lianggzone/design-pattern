package com.lianggzone.designpattern.prototype.action.clone;

/**
 * 用户模型
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月13日  v0.1</p><p>版本内容: 创建</p>
 */
public class PersonModel implements Cloneable{

	private String name;
	private Integer age;
	
	public PersonModel() {}
	public PersonModel(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public PersonModel clone(){
		try {
			PersonModel personModel = (PersonModel) super.clone();
			return personModel;
		} catch (CloneNotSupportedException e) {
			System.out.println("不支持复制！");
			return null;
		}
	}

	@Override
	public String toString() {
		StringBuffer content = new StringBuffer();
		content.append("Person[");
		content.append("name = ").append(this.name).append(", ");
		content.append("age = ").append(this.age).append("]");
		return content.toString();
	}
	
	
}
