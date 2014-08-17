package com.baron.aop.interceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ClassInterceptor {
	private Log logger = LogFactory.getLog(ClassInterceptor.class);
	
	@Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
	public void interceptor() {
	}
	
	@Before("interceptor()")
	public void doInterceptorBefore(JoinPoint thisJoinPoint) {
		logger.debug("ClassInterceptor:doInterceptorBefore");
	}
	
	@After("interceptor()")
	public void doInterceptorAfter(JoinPoint thisJoinPoint) {
		logger.debug("ClassInterceptor:doInterceptorAfter");
	}
}
