package com.myweb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myweb.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/spring-*.xml"})
public class HelloTest {
	
	static final Logger logger = LogManager.getLogger(HelloTest.class);
	
	@Autowired
	UserService userService;
	
	@Test
	public void testFindUserById(){
		logger.info(userService.getUserById(2));
	}
	
	@Test
	public void test(){
		logger.info("123");
	}
	
	
	

}
