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

import com.resourceInfo.entity.Technology;
import com.resourceInfo.service.TechnologyService;

@RestController
@RequestMapping("/tech")
@CrossOrigin("*")
public class TechnologyController {
	
	@Autowired
	public TechnologyService technologyService;
	
	

	
	@GetMapping("/{developerTypeName}")
	public ResponseEntity<List<Technology>> getAllTechnologiesByResourceTypeName(@PathVariable String developerTypeName){
		return new ResponseEntity<List<Technology>>(technologyService.getAllTechnologiesByResourceTypeName(developerTypeName),HttpStatus.OK);
	}
	

}
