package com.capstone.child.insurance.system.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.child.insurance.system.dao.ParentRepository;
import com.capstone.child.insurance.system.entity.Parent;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class ParentController {
	
	@Autowired
	ParentRepository parentRepo;

	
	// Demo
	
	@GetMapping("/")
	public String greet() {
		return "Child Insurence Management System.";
	}
	
	
	@PostMapping("/")
	public String createAdmin(@RequestBody Parent parent) {
		this.parentRepo.save(parent);
		return "Child Insurence Management System.";
	}
	
	
	// Demo Over
	
}
