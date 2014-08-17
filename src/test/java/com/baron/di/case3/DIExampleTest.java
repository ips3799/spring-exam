package com.baron.di.case3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIExampleTest {

	@Test
	public void test() throws Exception {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:com/baron/di/case3/case3.xml");
		DIExampleController controller = context.getBean(DIExampleController.class);
		
		assertNotNull(controller.getService());
	}
}
