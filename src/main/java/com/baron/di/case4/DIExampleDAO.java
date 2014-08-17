package com.baron.di.case4;

import org.springframework.stereotype.Repository;

@Repository
public class DIExampleDAO {

	public String selectString() {
		return "Hello";
	}
}
