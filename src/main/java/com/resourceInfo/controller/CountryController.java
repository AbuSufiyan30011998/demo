package com.resourceInfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resourceInfo.entity.Country;
import com.resourceInfo.service.CountryService;

@RestController
@RequestMapping("/country")
@CrossOrigin("*")
public class CountryController {
	
	@Autowired
	public CountryService  countryService;
	
	
	
	@GetMapping("/allCountry")
	public ResponseEntity<List<Country>> getAllCountries(){
		return new ResponseEntity<List<Country>>(countryService.getAllCountries(),HttpStatus.OK);
	}

	

}
