package com.resourceInfo.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceInfo.entity.Employee;
import com.resourceInfo.repository.EmployeeRepository;
import com.resourceInfo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	public EmployeeRepository employeeRepository;


	@Override
	public Employee findEmployeeById(int empId) {
		if(employeeRepository.existsById(empId)) {
		return employeeRepository.findById(empId).get();
		}
		return null;
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}


}
