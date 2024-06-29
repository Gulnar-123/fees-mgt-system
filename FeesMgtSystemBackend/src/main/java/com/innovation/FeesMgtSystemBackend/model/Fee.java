package com.innovation.FeesMgtSystemBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int recno;
private String email,cname;
private int total,paid,remaining;
public Fee() {
	super();
	// TODO Auto-generated constructor stub
}
public Fee(String email, String cname, int total, int paid, int remaining) {
	super();
	this.email = email;
	this.cname = cname;
	this.total = total;
	this.paid = paid;
	this.remaining = remaining;
}
public int getRecno() {
	return recno;
}
public void setRecno(int recno) {
	this.recno = recno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public int getPaid() {
	return paid;
}
public void setPaid(int paid) {
	this.paid = paid;
}
public int getRemaining() {
	return remaining;
}
public void setRemaining(int remaining) {
	this.remaining = remaining;
}

	
}
