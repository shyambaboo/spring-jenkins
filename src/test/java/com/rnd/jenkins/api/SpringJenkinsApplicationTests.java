package com.rnd.jenkins.api;




import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class SpringJenkinsApplicationTests {

private static final Logger log = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);


	@Test
	public void test() {
		log.info("Test case executing...");
		assertEquals(true, true);
	}
}
