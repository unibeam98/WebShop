package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.demo"})
//MappingScan扫描dao层
@MapperScan("com.example.demo.dao")
public class SchoolWebShopApplication {

	public static void main(String[] args) {

		SpringApplication.run(SchoolWebShopApplication.class, args);
	}

}
