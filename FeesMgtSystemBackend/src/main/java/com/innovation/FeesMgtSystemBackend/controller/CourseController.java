package com.innovation.FeesMgtSystemBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovation.FeesMgtSystemBackend.model.Course;
import com.innovation.FeesMgtSystemBackend.service.CourseService;

@RestController
@RequestMapping("/feemgt/")
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {

	@Autowired
	CourseService cs;
	
	@GetMapping("/course")
	public List<Course> getAll()
	{
		return cs.getAll();
	}
	
	@PostMapping("/course")
	public Course save(@RequestBody Course c)
	{
		return cs.insert(c);
	}
	@DeleteMapping("/course/{cid}")
	public void delete(@PathVariable("cid")int cid)
	{
		cs.delete(cid);
	}
	@PutMapping("/course/{cid}")
	public Course update(@PathVariable("cid")int cid,@RequestBody Course c)
	{
		return cs.update(cid, c);
	}
	@GetMapping("/course/{cn}")
public Course search(@PathVariable("cn")String  cn)
{
		return cs.search(cn);
}
}
