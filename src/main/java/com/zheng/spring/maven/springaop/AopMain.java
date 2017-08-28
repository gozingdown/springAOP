package com.zheng.spring.maven.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zheng.spring.maven.springaop.service.FactoryService;
import com.zheng.spring.maven.springaop.service.ShapeService;

public class AopMain {
	public static void main(String[] args) { 
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		//ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService)factoryService.getBean("shapeService");
		shapeService.getCircle();
//		try {
//			shapeService.getCircle().setName("Dummy Cirle Name1");
//		} catch(RuntimeException e) {
//		}
//		shapeService.getCircle().setNameAndReturn("Dummy Circle Name");
//		System.out.println(shapeService.getCircle().getName());
//		System.out.println(shapeService.getTriangle().getName());
	}
}
