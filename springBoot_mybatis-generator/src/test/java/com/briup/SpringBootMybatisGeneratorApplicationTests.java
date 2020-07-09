package com.briup;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.briup.bean.User;
import com.briup.service.IUserService;

@SpringBootTest
class SpringBootMybatisGeneratorApplicationTests {
	@Autowired
	private IUserService service;
	
	@Test
	void contextLoads() {
		User user = new User();
		user.setId(1L);
		user.setAge(22);
		user.setName("菜鸡");
		user.setGender("女");
		service.saveUser(user);
		List<User> list = service.findAll();
		for (User user2 : list) {
			System.out.println(user2);
		}
	}

}
