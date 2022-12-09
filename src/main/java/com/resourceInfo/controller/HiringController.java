package com.resourceInfo.controller;

import java.util.List;

import com.resourceInfo.service.HiringTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resourceInfo.entity.HiringType;


@RestController
@RequestMapping("/hiringType")
@CrossOrigin("*")
public class HiringController {
	
	@Autowired
	HiringTypeService hiringTypeService;
	
	@GetMapping("/")
	public ResponseEntity<?> getAllHiringType() {
		List<HiringType> hiringTypes = hiringTypeService.getAllHiringType();
		return new ResponseEntity<>(hiringTypes, HttpStatus.OK);
	}
}
