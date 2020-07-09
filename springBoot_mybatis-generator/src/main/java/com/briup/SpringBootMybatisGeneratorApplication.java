package com.briup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.briup.mapper")
@SpringBootApplication
public class SpringBootMybatisGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisGeneratorApplication.class, args);
	}

}
