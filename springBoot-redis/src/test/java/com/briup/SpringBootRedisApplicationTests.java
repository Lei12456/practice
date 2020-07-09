package com.briup;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.briup.service.HelloService;

@SpringBootTest
class SpringBootRedisApplicationTests {
	
	@Autowired HelloService service;
	
	@Test
	void contextLoads() {
		service.hello();
	}

}
