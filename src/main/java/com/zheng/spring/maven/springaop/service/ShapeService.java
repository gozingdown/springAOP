package com.zheng.spring.maven.springaop.service;

import com.zheng.spring.maven.springaop.aspect.Loggable;
import com.zheng.spring.maven.springaop.model.Circle;
import com.zheng.spring.maven.springaop.model.Triangle;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class ShapeService {
//	@Autowired
	private Circle circle;
//	@Autowired
	private Triangle triangle;
	
	public Circle getCircle() {
		System.out.println("Circle getter called");
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	
}
