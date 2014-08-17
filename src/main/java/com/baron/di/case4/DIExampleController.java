package com.baron.di.case4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class DIExampleController {

	@Autowired
	private DIExampleService service;
	
	
	public String testService() {
		return service.testDao();
	}
}