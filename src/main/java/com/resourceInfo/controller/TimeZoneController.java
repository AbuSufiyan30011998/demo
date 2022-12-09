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

import com.resourceInfo.entity.TimeZone;
import com.resourceInfo.service.TimeZoneService;

@RestController
@RequestMapping("/tzs")
@CrossOrigin("*")
public class TimeZoneController {
	@Autowired
	TimeZoneService timeZoneService;
	

	@GetMapping("/getTimeZone")
	public ResponseEntity<List<TimeZone>> getAllTimeZoneService() {
		return new ResponseEntity<List< TimeZone>>(timeZoneService.getAllTimeZones(),HttpStatus.OK);
	}

}
