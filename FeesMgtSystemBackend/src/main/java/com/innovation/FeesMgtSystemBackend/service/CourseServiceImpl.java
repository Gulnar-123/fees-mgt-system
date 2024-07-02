package com.innovation.FeesMgtSystemBackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.innovation.FeesMgtSystemBackend.model.Course;
import com.innovation.FeesMgtSystemBackend.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	@Qualifier("couRepo")
	CourseRepository couRepo;
	
	@Override
	public Course insert(Course c) {
		// TODO Auto-generated method stub
		return couRepo.save(c);
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return couRepo.findAll();
	}

	@Override
	public void delete(int cid) {
	couRepo.deleteById(cid);
		
	}

	@Override
	public Course update(int id, Course c) {
Optional<Course> opt=couRepo.findById(id);
if(opt.isPresent())
{
	Course cold=opt.get();
	cold.setCname(c.getCname());
	cold.setDuration(c.getDuration());
	cold.setFees(c.getFees());
	return couRepo.save(cold);
}
		return null;
	}

	@Override
	public Course search(String cn) {
		Optional<Course> opt=couRepo.findByCname(cn);
		if(opt.isPresent())
		{
			Course cold=opt.get();
			
			return cold;
		}
				return null;
	}
	

}
