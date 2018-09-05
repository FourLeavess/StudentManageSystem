package com.ysy.studentmanagesystem.mapper;

import java.sql.Date;

public class Student {

	private String name;
	
	private String loginId;
	
	private String email;
	
	private int age;
	
	private Date birthday;
	
	private String sex;
	
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", loginId=" + loginId + ", email="
				+ email + ", age=" + age + ", birthday=" + birthday + ", sex="
				+ sex + ", description=" + description + "]";
	}
	
	
}
