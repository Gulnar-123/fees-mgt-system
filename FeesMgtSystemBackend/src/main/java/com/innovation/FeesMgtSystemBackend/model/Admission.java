package com.innovation.FeesMgtSystemBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Admission {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long admid;

private String email,coursenm,collegenm,qualification;

public Admission() {
	super();
	// TODO Auto-generated constructor stub
}

public Admission(String email, String coursenm, String collegenm, String qualification) {
	super();
	this.email = email;
	this.coursenm = coursenm;
	this.collegenm = collegenm;
	this.qualification = qualification;
}

public long getAdmid() {
	return admid;
}

public void setAdmid(long admid) {
	this.admid = admid;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCoursenm() {
	return coursenm;
}

public void setCoursenm(String coursenm) {
	this.coursenm = coursenm;
}

public String getCollegenm() {
	return collegenm;
}

public void setCollegenm(String collegenm) {
	this.collegenm = collegenm;
}

public String getQualification() {
	return qualification;
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}


}
