package com.innovation.FeesMgtSystemBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovation.FeesMgtSystemBackend.model.AdminLogin;
import com.innovation.FeesMgtSystemBackend.service.AdminService;

@RestController
@RequestMapping("/feemgt/")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
	@Autowired
	AdminService as;
	
	@GetMapping("/admin/{email}/{password}")
	public AdminLogin login(@PathVariable("email")String email,@PathVariable("password")String password)
	{
		return as.login(email, password);
	}

}
