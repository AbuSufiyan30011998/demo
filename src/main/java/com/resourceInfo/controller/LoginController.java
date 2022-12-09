package com.resourceInfo.controller;


import com.resourceInfo.entity.Employee;
import com.resourceInfo.entity.UserLogin;
import com.resourceInfo.serviceImplementation.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/userLogin")
public class LoginController {
	
	@Autowired
	LoginServiceImpl loginService;
	
	@PostMapping("/check")
	public ResponseEntity<?> checkPassword(@RequestBody UserLogin userlogin) {
		Employee user = loginService.passwordCheck(userlogin);
		if(user != null) {
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
		return new ResponseEntity<>(false, HttpStatus.OK);
	}

	@GetMapping("/get/{employeeEmail}")
	public ResponseEntity<?> getEmployeeByEmail(@PathVariable String employeeEmail) {
		Employee user = loginService.getEmployeeDetailsByEmail(employeeEmail);
		System.out.println(user);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
}
