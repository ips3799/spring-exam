package com.baron.di.case1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIExampleTest {

	@Test
	public void testCreateObjectNoSpring() throws Exception {
		DIExample actual = new DIExample();
		
		assertNotNull(actual);
	}
	
	@Test
	public void testCreateObjectWithSpring() throws Exception {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:com/baron/di/case1/case1.xml");
		
		assertNotNull(context.getBean(DIExample.class));
		assertNotNull(context.getBean("DIExample"));
	}
}