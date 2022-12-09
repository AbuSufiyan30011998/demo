package com.resourceInfo.controller;

import com.resourceInfo.entity.QualificationDegreeBranch;
import com.resourceInfo.service.QualificationDegreeBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qlfydegbr")
@CrossOrigin("*")
public class QualificationDegreeBranchController {


	@Autowired
	public QualificationDegreeBranchService qualificationDegreeBranchService;
	
	
	@GetMapping("/")
	public  ResponseEntity<List<QualificationDegreeBranch>> getAllSpecializations() {
		return new ResponseEntity<List<QualificationDegreeBranch>>(qualificationDegreeBranchService.getAllSpecializations(),HttpStatus.OK);
	}
	
	@GetMapping("/degree/{degreeName}")
	public  ResponseEntity<List<QualificationDegreeBranch>> getAllSpecializationsByDegreeName(@PathVariable String degreeName) {
		return new ResponseEntity<List<QualificationDegreeBranch>>(qualificationDegreeBranchService.getAllSpecializationsByDegreeName(degreeName),HttpStatus.OK);
	}
	
	
}
