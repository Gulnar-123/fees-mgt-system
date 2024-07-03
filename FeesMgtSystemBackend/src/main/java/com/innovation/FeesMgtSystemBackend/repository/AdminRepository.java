package com.innovation.FeesMgtSystemBackend.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovation.FeesMgtSystemBackend.model.AdminLogin;

@Repository
@Qualifier("adminRepo")
public interface AdminRepository extends JpaRepository<AdminLogin, Integer>{
	
	AdminLogin findByEmailAndPassword(String email,String password);

}
