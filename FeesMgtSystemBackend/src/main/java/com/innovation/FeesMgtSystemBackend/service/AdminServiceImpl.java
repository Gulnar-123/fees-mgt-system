package com.innovation.FeesMgtSystemBackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.FeesMgtSystemBackend.model.AdminLogin;
import com.innovation.FeesMgtSystemBackend.repository.AdminRepository;

@Service
public class AdminServiceImpl  implements AdminService{

	@Autowired
	@Qualifier("adminRepo")
	AdminRepository adminRepo;
	@Override
	public AdminLogin login(String e, String p) {
		// TODO Auto-generated method stub
		return adminRepo.findByEmailAndPassword(e, p);
	}

}
