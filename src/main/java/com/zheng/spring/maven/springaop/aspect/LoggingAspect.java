package com.zheng.spring.maven.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public String com.zheng.spring.maven.springaop.model.Circle.getName())")
	public void loggingAdvice() {
		System.out.println("Advice run. Get Method called.");
	}
	
	// wildcard
	@Before("execution(public String get*(..))")
	public void loggingAdvice2() {
		System.out.println("Advice2 run. Get Method called.");
	}
	
//	// wildcard: 0 or any number of arguments
//	@Before("execution(public * get*(..))")
//	public void loggingAdvice3() {
//		System.out.println("Advice3 run. Get Method called.");
//	}
//	
//	// wildcard: has to be some arguments (>0)
//	@Before("execution(public * get*(*))")
//	public void loggingAdvice3() {
//		System.out.println("Advice3 run. Get Method called.");
//	}
}
