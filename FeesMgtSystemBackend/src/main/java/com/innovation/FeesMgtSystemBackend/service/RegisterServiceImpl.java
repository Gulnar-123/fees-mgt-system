package com.innovation.FeesMgtSystemBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.FeesMgtSystemBackend.model.Register;
import com.innovation.FeesMgtSystemBackend.repository.RegisterRepository;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	@Qualifier("regRepo")
	RegisterRepository regRepo;
	
	@Override
	public Register insert(Register r) {
		// TODO Auto-generated method stub
		return regRepo.save(r);
	}

	@Override
	public List<Register> getAll() {
		// TODO Auto-generated method stub
		return regRepo.findAll();
	}

	@Override
	public Register login(String e, String p) {
		// TODO Auto-generated method stub
		return regRepo.findByEmailAndPassword(e, p);
	}

}
