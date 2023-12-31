package com.example.stockapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.example.stockapp")

public class StockAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockAppApplication.class, args);
	}

}
