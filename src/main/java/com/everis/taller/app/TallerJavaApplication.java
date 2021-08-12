package com.everis.taller.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TallerJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TallerJavaApplication.class, args);
		String a = "Hola Mundo utilizando la herramienta SpringBoot";
		System.out.println(a);
	}

}
