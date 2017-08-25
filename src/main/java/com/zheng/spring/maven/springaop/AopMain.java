package com.zheng.spring.maven.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zheng.spring.maven.springaop.service.ShapeService;

public class AopMain {
	public static void main(String[] args) { 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		shapeService.getCircle().setName("Dummy Name");
		System.out.println(shapeService.getCircle().getName());
		System.out.println(shapeService.getTriangle().getName());
	}
}
