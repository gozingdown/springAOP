package com.zheng.spring.maven.springaop.service;

import com.zheng.spring.maven.springaop.model.Circle;
import com.zheng.spring.maven.springaop.model.Triangle;

public class FactoryService {

	public Object getBean(String beanType) {
		if (beanType.equals("shapeService")) {
			return new ShapeServiceProxy();
		}
		if (beanType.equals("circle")) {
			return new Circle();
		}
		if (beanType.equals("triangle")) {
			return new Triangle();
		}
		return null;
	}
}
