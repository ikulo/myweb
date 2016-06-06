package com.myweb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myweb.user.service.UserService;

public class Test {
	
	private static final Logger logger = LogManager.getLogger(Test.class);
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		UserService userDao = (UserService) ctx.getBean("userService");
		
		logger.info(userDao);
	}

}
