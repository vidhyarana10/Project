package com.vidya.icream.icream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IcreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcreamApplication.class, args);
		System.out.println("Ice-cream");
	}

}
