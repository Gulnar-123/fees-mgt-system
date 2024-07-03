package com.innovation.FeesMgtSystemBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdminLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adid;
private String email,password;
public AdminLogin() {
	super();
	// TODO Auto-generated constructor stub
}
public int getAdid() {
	return adid;
}
public void setAdid(int adid) {
	this.adid = adid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public AdminLogin(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}

}
