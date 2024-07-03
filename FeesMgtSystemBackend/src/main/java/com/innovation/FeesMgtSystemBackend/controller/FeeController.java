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

import com.innovation.FeesMgtSystemBackend.model.Fee;
import com.innovation.FeesMgtSystemBackend.service.FeeService;

@RestController
@RequestMapping("/feemgt/")
@CrossOrigin(origins = "http://localhost:4200")
public class FeeController {

	@Autowired
	FeeService fs;
	
	@GetMapping("/fee")
	public List<Fee> getAll()
	{
		return fs.getAll();
	}
	@PostMapping("/fee")
	public Fee save(@RequestBody Fee f)
	{
		return fs.insert(f);
	}
	@GetMapping("/fee/{email}")
	public List<Fee> getAllByEm(@PathVariable("email") String email)
	{
		return fs.getAllByemail(email);
	}
}
