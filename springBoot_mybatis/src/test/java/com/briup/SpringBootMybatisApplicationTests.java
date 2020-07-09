package com.briup;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.briup.bean.User;
import com.briup.service.IUserServiceImpl;

@SpringBootTest
class SpringBootMybatisApplicationTests {
	
	@Autowired 
	IUserServiceImpl service;
	@Test
	void contextLoads() {
		service.saveUser(new User(3,"菜鸡",22,"女"));
		List<User> list = service.findUser();
		for (User user : list) {
			System.out.println(user);
		}
	}

}
