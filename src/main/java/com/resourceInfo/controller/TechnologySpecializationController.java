package com.resourceInfo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
import com.resourceInfo.entity.TechnologySpecialization;
import com.resourceInfo.service.TechnologySpecializationService;



@RestController
@RequestMapping("/techspc")
@CrossOrigin("*")
public class TechnologySpecializationController {
	
	@Autowired
	public TechnologySpecializationService technologySpecializationService;
	

	@GetMapping("/{technologyName}")
	public ResponseEntity<List<List<TechnologySpecialization>>> getAllTechnologySpecializationsByTechnologyName(@PathVariable("technologyName") String technologyName){
		System.out.println(technologyName);
		return new ResponseEntity<List<List<TechnologySpecialization>>>(technologySpecializationService.getAllTechSpecializationsByTechnologyName(technologyName),HttpStatus.OK);
	}
	
	

}
