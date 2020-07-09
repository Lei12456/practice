package com.briup;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.briup.bean.User;
import com.briup.service.IUserService;

@SpringBootTest
class SpringBootSpringDataJpaJspApplicationTests {
	@Autowired
	private IUserService service;
	@Test
	void contextLoads() {
		List<User> list = service.findAll();
		for (User user : list) {
			System.out.println(user);
		}
	}

}
