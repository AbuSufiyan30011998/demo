package com.resourceInfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resourceInfo.entity.Employee;
import com.resourceInfo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {
	@Autowired
	public EmployeeService employeeService;
	
	@GetMapping("/{employeeId}")
	public ResponseEntity<Employee> findEmployeeById(@PathVariable int employeeId)
	{
		return new ResponseEntity<Employee>(employeeService.findEmployeeById(employeeId),HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Employee>> findAllEmployees()
	{
		return new ResponseEntity<List<Employee>>(employeeService.findAllEmployees(),HttpStatus.OK);
	}
	
	
	

}
