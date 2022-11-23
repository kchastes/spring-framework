package com.yck.entity;

import org.springframework.beans.factory.InitializingBean;

public class User implements InitializingBean {

	private String name;


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean method invoke");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				'}';
	}
}
