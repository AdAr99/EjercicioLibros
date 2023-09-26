package com.adri.crud_libros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = {"com.adri.controller", "com.adri.service"})
public class CrudLibrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudLibrosApplication.class, args);
	}

}
