package com.user.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	Userservice service;
	
	@PostMapping("/create")
	public User createuser(@RequestBody User user) {
		return service.createuser(user);
	}
	@GetMapping("/name")
	public User viewbyusername(@RequestParam String username) {
		return service.findByUsername(username);
	}
}
