package com.zheng.spring.maven.springaop.service;

import com.zheng.spring.maven.springaop.model.Circle;
import com.zheng.spring.maven.springaop.model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;
	
	public Circle getCircle() {
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
