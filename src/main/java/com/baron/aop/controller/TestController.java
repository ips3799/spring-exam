package com.baron.aop.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baron.aop.bo.TestBO;

@Controller
public class TestController {
	private Log logger = LogFactory.getLog(TestController.class);
	
	@Autowired
	private TestBO bo;
	
	@RequestMapping("/interceptor.do")
	public String interceptor() {
		return "interceptor";
	}
	
	@RequestMapping("/interceptor1.do")
	public String interceptor1() {
		logger.debug(bo.getHello());
		return "interceptor";
	}
}
