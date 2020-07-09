package com.briup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.briup.dao")
@SpringBootApplication
public class SpringBootMybatisAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisAnnotationApplication.class, args);
	}

}
