package com.briup.bean;
/** 
* @author 作者 angel: 
* @version 创建时间：2020年6月27日 下午5:57:29 
* 类说明 
*/
public class User {
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	
	public User() {
		super();
	}
	public User(Integer id, String name, Integer age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
