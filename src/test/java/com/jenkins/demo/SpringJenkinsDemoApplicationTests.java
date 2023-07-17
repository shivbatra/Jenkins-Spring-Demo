package com.jenkins.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDemoApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);
	
	@Test
	void contextLoads() {
		logger.info("-----------------------Test Case Executing -----------------------------------------");
		assertTrue(true);
	}

}
