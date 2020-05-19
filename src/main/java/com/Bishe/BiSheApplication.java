package com.Bishe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.Bishe.mapper"}) 
public class BiSheApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiSheApplication.class, args);
	}

}
