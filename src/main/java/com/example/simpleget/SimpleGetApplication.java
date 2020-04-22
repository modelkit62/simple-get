package com.example.simpleget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleGetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleGetApplication.class, args);
	}

	@RequestMapping("/get")
	private String getMessage(){
		return "Hello World!";
	}

}
