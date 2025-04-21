package com.azureDemo.azureDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDemoApplication {

	@Autowired
	private UserRepo userRepo;

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userRepo.save(user);
	}

	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureDemoApplication.class, args);
	}

}
