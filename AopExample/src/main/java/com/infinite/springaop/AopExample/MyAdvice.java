package com.infinite.springaop.AopExample;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAdvice {
	@Pointcut("execution(* com.infinite.springaop.*.*(..))")
	private void All(){
		
	}
	@Before("All()")
	public void beforeAdvice(){
	     System.out.println("Before advice executed.");
	}
	@After("All()")
	public void afterAdvice(){
	    System.out.println("After advice executed.");
	}
}
