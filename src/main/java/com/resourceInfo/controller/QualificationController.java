package com.resourceInfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resourceInfo.entity.Qualification;
import com.resourceInfo.service.QualificationService;

@RestController
@RequestMapping("/qlfy")
@CrossOrigin("*")
public class QualificationController {
	
	@Autowired
	public QualificationService qualificationService;
	
	
	@GetMapping("/qlfyName")
	public  ResponseEntity<List<Qualification>> getAllQualification() {
		 return new ResponseEntity<List<Qualification>>(qualificationService.getAllQualifications(),HttpStatus.OK);
	}
	
	
	@GetMapping("/{qualificationId}")
	public  ResponseEntity<Qualification> getQualificationEntityByID(@PathVariable int qualificationId) {
		 //System.out.println(qualificationId);
		 return new ResponseEntity<Qualification>(qualificationService.getQualificationEntityById(qualificationId),HttpStatus.OK);
	}
	
	
	

}
