package com.resourceInfo.serviceImplementation;


import com.resourceInfo.entity.Employee;
import com.resourceInfo.entity.UserLogin;
import com.resourceInfo.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service 
public class LoginServiceImpl {

	@Autowired
	LoginRepository loginRepo;
	
	public Employee passwordCheck(UserLogin userlogin) {
		Employee existingUser =loginRepo.find(userlogin.getEmployeeEmail());
		if (existingUser != null) {
			if (existingUser.getEmployeePassword().equals(userlogin.getEmployeePassword())) {
				Employee employee = new Employee(existingUser.getEmployeeId(), existingUser.getEmployeeName(), existingUser.getUnitName(),
						existingUser.getManagerId(), existingUser.getManagerName()	);
				System.out.println("user =>"+employee.toString());
				return employee;
			}
		}
		return null;
	}

    public Employee getEmployeeDetailsByEmail(String emailId) {
		Employee user = loginRepo.find(emailId);
		//System.out.println(user);
		return user;
    }
}
