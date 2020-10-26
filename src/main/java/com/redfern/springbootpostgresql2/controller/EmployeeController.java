package com.redfern.springbootpostgresql2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfern.springbootpostgresql2.model.Employee;
import com.redfern.springbootpostgresql2.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	private final EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return this.employeeRepository.findAll();
	}
}
