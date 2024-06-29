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

import com.innovation.FeesMgtSystemBackend.model.Register;
import com.innovation.FeesMgtSystemBackend.service.RegisterService;

@RestController
@RequestMapping("/feemgt/")
@CrossOrigin(origins = "http://localhost:4200")
public class RegisterController {

	@Autowired
	RegisterService regServ;
	
	@GetMapping("/register")
	public List<Register> getAll()
	{
		return regServ.getAll();
	}
	@PostMapping("/register")
	public Register save(@RequestBody Register r)
	{
		return regServ.insert(r);
	}
	@GetMapping("/login/{email}/{password}")
	public Register login(@PathVariable("email")String email,@PathVariable("password")String p)
	{
		return regServ.login(email, p);
	}
}
