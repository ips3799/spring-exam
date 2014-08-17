package com.baron.di.case4;


import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.baron.di.case4.DIExampleController;


public class DIExampleTest {

	@Test
	public void test() throws Exception {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:com/baron/di/case4/case4.xml");
		DIExampleController controller = context.getBean(DIExampleController.class);
		
		assertEquals("Hello", controller.testService());
	}
}
