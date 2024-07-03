package com.innovation.FeesMgtSystemBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.FeesMgtSystemBackend.model.Fee;
import com.innovation.FeesMgtSystemBackend.repository.FeeRepository;

@Service
public class FeeServiceImpl implements FeeService {

	@Autowired
	@Qualifier("feeRepo")
	FeeRepository feeRepo;
	@Override
	public Fee insert(Fee f) {
		// TODO Auto-generated method stub
		return feeRepo.save(f);
	}

	@Override
	public List<Fee> getAll() {
		// TODO Auto-generated method stub
		return feeRepo.findAll();
	}

	@Override
	public List<Fee> getAllByemail(String e) {
		// TODO Auto-generated method stub
				return feeRepo.findAllByEmail(e);
	}

}
