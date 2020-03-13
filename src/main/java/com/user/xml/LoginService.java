package com.user.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LoginService {
	@Autowired
	Userrepo repo;

	public String Userlogin(String username, String password) {
		if (username != null && password != null) {
			repo.findByUsernameAndPassword(username, password);
		}
		else
			System.out.println("Username or Password is empty");
		return "User Login Successful";
	}

}
