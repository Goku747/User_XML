package com.user.xml;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long id;
@NotEmpty(message = "Username should not be empty")
private String username;
@NotEmpty(message = "Password should not be empty")
private String password;
@OneToOne(cascade = CascadeType.ALL)
@NotFound(action = NotFoundAction.IGNORE)
private Address address;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

}
