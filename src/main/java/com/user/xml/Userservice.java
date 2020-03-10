package com.user.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
	@Autowired
	Userrepo repo;

	public User createuser(User user) {
		if (user != null) {
			repo.save(user);
		}
		return user;
	}
	public User findByUsername(String username) {
		User user = new User();
		if(username!=null) {
			user = repo.findByUsername(username);
		}
		return user;
	}

}
