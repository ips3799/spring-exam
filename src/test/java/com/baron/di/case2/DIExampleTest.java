package com.baron.di.case2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIExampleTest {

	@Test
	public void test() throws Exception {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:com/baron/di/case2/case2.xml");
		
		assertNotNull(context.getBean(DIExampleController.class));
		assertNotNull(context.getBean("DIExampleController"));
		assertNotNull(context.getBean(DIExampleService.class));
		assertNotNull(context.getBean("DIExampleService"));
		assertNotNull(context.getBean(DIExampleDAO.class));
		assertNotNull(context.getBean("DIExampleDAO"));
	}
}
