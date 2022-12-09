package com.resourceInfo.controller;

import com.resourceInfo.entity.QualificationDegree;
import com.resourceInfo.service.QualificationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qlfydeg")	
@CrossOrigin("*")
public class QualificationDegreeController {

	
	@Autowired
	public QualificationDegreeService qualificationDegreeService;
	
	
	@GetMapping("/getAllDegree")
	public  ResponseEntity<List<QualificationDegree>> getAllDegree() {
		 return new ResponseEntity<List<QualificationDegree>>(qualificationDegreeService.getAllDegrees(),HttpStatus.OK);
	}
	
	@GetMapping("/qualification/{qualificationName}")
	public  ResponseEntity<List<QualificationDegree>> getAllQualificationEntityByQualificationId(@PathVariable String qualificationName) {
		 return new ResponseEntity<List<QualificationDegree>>(qualificationDegreeService.getAllDegreesByQualificationName(qualificationName),HttpStatus.OK);
	}
	
	@GetMapping("/{degreeId}")
	public  ResponseEntity<QualificationDegree> getQualificationEntityByID(@PathVariable int degreeId) {
		 return new ResponseEntity<QualificationDegree>(qualificationDegreeService.getQly_DegreeById(degreeId),HttpStatus.OK);
	}

}
