package com.user.xml;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface Userrepo extends JpaRepository<User, Long> {

	public User findByUsername(String username);
	public User findByUsernameAndPassword(String username, String password);
	
	
	
}
