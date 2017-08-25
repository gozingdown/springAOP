package com.zheng.spring.maven.springaop.model;

import com.zheng.spring.maven.springaop.aspect.Loggable;

public class Triangle {
	private String name;

	@Loggable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
