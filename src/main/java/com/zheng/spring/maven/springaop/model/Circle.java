package com.zheng.spring.maven.springaop.model;

import com.zheng.spring.maven.springaop.aspect.Loggable;

public class Circle {
	private String name;

	@Loggable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circle's setter called");
		throw new RuntimeException();
	}
	
	
	public String setNameAndReturn(String name) {
		this.name = name;
		System.out.println("Circle's setNameAndReturn called");
		return name;
	}
}
