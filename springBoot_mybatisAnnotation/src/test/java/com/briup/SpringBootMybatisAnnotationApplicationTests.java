package com.briup;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.briup.bean.User;
import com.briup.dao.UserMapper;

@SpringBootTest
class SpringBootMybatisAnnotationApplicationTests {
	@Autowired
	private UserMapper mapper;
	
	@Test
	void contextLoads() {
		List<User> list = mapper.findAllUser();
		System.out.println(list);
	}

}
