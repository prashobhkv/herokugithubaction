package com.vrushali.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GithubactionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubactionsApplication.class, args);
	}

}

@RestController
class HelloController{
	
	@GetMapping("/")
	String hello() {
		
		return "Hello Team";
	}
	
}

