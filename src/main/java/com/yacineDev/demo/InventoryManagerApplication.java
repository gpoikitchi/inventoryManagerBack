package com.yacineDev.demo;

import com.yacineDev.demo.Controller.ProductController;
import com.yacineDev.demo.Repositories.ProductRepo;
import com.yacineDev.demo.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryManagerApplication {
	@Autowired
	ProductServices productServices;
	@Autowired
	ProductRepo productRepo ;

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagerApplication.class, args);
	}
}