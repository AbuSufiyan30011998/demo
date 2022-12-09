package com.resourceInfo.controller;

import java.util.List;

import com.resourceInfo.entity.State;
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

import com.resourceInfo.service.StateService;

@RestController
@RequestMapping("/state")
@CrossOrigin("*")
public class StateController {
	@Autowired
	public StateService stateService;
	

	@GetMapping("/{country}")
	public ResponseEntity<List<State>> getAllStatesOfCountry(@PathVariable String country ){
		return new  ResponseEntity<List<State>> (stateService.getAllStatesOfCountry(country),HttpStatus.OK);
		
	}

}
