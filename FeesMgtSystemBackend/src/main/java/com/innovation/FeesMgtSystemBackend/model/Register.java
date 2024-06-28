package com.innovation.FeesMgtSystemBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Register {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String name,address,city,gender,contact,email,password;
public Register() {
	super();
	// TODO Auto-generated constructor stub
}
public Register(String name, String address, String city, String gender, String contact, String email,
		String password) {
	super();
	this.name = name;
	this.address = address;
	this.city = city;
	this.gender = gender;
	this.contact = contact;
	this.email = email;
	this.password = password;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
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

}
