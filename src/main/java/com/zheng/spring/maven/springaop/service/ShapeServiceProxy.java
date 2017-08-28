package com.zheng.spring.maven.springaop.service;

import com.zheng.spring.maven.springaop.aspect.LoggingAspect;
import com.zheng.spring.maven.springaop.model.Circle;

public class ShapeServiceProxy extends ShapeService{
	
	public Circle getCircle() {
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}
}
