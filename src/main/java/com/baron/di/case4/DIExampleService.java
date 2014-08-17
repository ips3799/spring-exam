package com.baron.di.case4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DIExampleService {
	
	@Autowired
	private DIExampleDAO dao;
	
	
	public String testDao() {
		return dao.selectString();
	}

}