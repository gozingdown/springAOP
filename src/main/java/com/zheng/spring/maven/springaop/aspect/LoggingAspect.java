package com.zheng.spring.maven.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
		System.out.println("loggingAdvice executed " + circle.getName());
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
	
//	@Before("args(name)")
//	@After("args(name)")
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringArgumentMethods(String name, Object returnString) { // name is the actual argument, and we are also telling spring that the argument is of type String
		System.out.println("A method that takes String arguments has been called. The arg is " + name + " and the return value is " + returnString);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void exceptionAdvice(String name, RuntimeException ex) {
		System.out.println("An exception has been thrown " + ex);
	}
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice executed.");
	}
	
	@Pointcut("execution(public String get*(..))")
	public void allGetters() {}

	@Pointcut("within(com.zheng.spring.maven.springaop.model.Circle)")
	public void allCircleMethods() {}
	
	
	@Around("@annotation(com.zheng.spring.maven.springaop.aspect.Loggable)")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnValue = null;//remember that you need to return the value if the function you want to put advice to returns a value
		try {
			System.out.println("Before Advice");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After Returning");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
		System.out.println("After Finally");
		return returnValue;
	}
	
	
	public void loggingAdvice() {
		System.out.println("Logging from the advice");
	}
}
