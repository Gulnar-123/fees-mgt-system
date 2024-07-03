package com.innovation.FeesMgtSystemBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.FeesMgtSystemBackend.model.Admission;
import com.innovation.FeesMgtSystemBackend.repository.AdmissionRepository;
import com.innovation.FeesMgtSystemBackend.repository.CourseAdmission;

@Service
public class AdmissionServiceImpl implements AdmissionService {
@Autowired
@Qualifier("admRepo")
AdmissionRepository admRepo;

	@Override
	public Admission insert(Admission a) {
		// TODO Auto-generated method stub
		return admRepo.save(a);
	}

	@Override
	public List<Admission> getAll() {
		// TODO Auto-generated method stub
		return admRepo.findAll();
	}

	@Override
	public List<CourseAdmission> getAllByEmail(String e) {
		// TODO Auto-generated method stub
				return admRepo.findAllCoursesByEmail(e);
	}
	

}
