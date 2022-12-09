package com.resourceInfo.service;

import java.util.List;

import com.resourceInfo.entity.Employee;

public interface EmployeeService {


	public Employee findEmployeeById(int empId);
	public List<Employee> findAllEmployees();
	
	
}
