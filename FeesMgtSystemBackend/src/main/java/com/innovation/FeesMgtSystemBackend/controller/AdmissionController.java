package com.innovation.FeesMgtSystemBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovation.FeesMgtSystemBackend.model.Admission;
import com.innovation.FeesMgtSystemBackend.repository.CourseAdmission;
import com.innovation.FeesMgtSystemBackend.service.AdmissionService;

@RestController
@RequestMapping("/feemgt/")
@CrossOrigin(origins = "http://localhost:4200")
public class AdmissionController {

	@Autowired
	AdmissionService adms;
	
	@GetMapping("/admission")
	public List<Admission> getAll()
	{
		return adms.getAll();
	}
	@PostMapping("/admission")
	public Admission save(@RequestBody Admission a)
	{
		return adms.insert(a);
	}
	@GetMapping("/admission/{email}")
	public List<CourseAdmission> getAllEmail(@PathVariable("email")String email)
	{
		return adms.getAllByEmail(email);
	}
}
