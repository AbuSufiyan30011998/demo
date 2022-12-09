package com.resourceInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resourceInfo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public Employee findByEmployeeEmailAndEmployeePassword(String employeeEmail,String employeePassword);

}
