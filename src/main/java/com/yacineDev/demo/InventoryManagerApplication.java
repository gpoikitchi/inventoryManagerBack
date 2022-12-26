package com.yacineDev.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;

@SpringBootApplication
public class InventoryManagerApplication {
	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagerApplication.class, args);
		InventoryManagerApplication app = new InventoryManagerApplication();
		try {
			app.productService.insertProduct("Product 3", 29.99);

		} catch (SQLException e) {
			// Handle the exception
		}
	}
}