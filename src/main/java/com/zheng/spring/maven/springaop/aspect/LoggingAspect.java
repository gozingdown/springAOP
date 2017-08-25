package com.zheng.spring.maven.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.zheng.spring.maven.springaop.model.Circle;

@Aspect
public class LoggingAspect {
	
//	@Before("execution(public String com.zheng.spring.maven.springaop.model.Circle.get*(..))")
//	public void loggingAdvice() {
//		System.out.println("Advice run. Get Method called.");
//	}
	
//	@Before("allGetters() && allCircleMethods()")
	@Before("allGetters() && allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println("JoinPoint: " + joinPoint.toString());
		Circle circle = (Circle) joinPoint.getTarget();// the object
		System.out.println(circle.getName());
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
	
	@Before("args(name)")
	public void stringArgumentMethods(String name) { // name is the actual argument, and we are also telling spring that the argument is of type String
		System.out.println("A method that takes String arguments has been called. The value is " + name);
	}
	
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice executed.");
	}
	
	@Pointcut("execution(public String get*(..))")
	public void allGetters() {}

	@Pointcut("within(com.zheng.spring.maven.springaop.model.Circle)")
	public void allCircleMethods() {}
	
}
