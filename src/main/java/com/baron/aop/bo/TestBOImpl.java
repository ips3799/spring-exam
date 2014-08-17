package com.baron.aop.bo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
public class TestBOImpl implements TestBO {
	private Log logger = LogFactory.getLog(TestBOImpl.class);

	@Override
	public String getHello() {
		logger.debug("IFInterceptor Test");
		return "hello";
	}

}
