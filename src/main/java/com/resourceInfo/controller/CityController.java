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

import com.resourceInfo.entity.City;
import com.resourceInfo.service.CityService;

@RestController
@RequestMapping("/city")
@CrossOrigin("*")
public class CityController {
	
	@Autowired
	public CityService cityService;
	
	
	@GetMapping("/{state}")
	public ResponseEntity<List<City>> getAllCitiesByState(@PathVariable String state ){
		return new  ResponseEntity<List<City>> (cityService.getAllCitiesByState(state),HttpStatus.OK);
		
	}

}
