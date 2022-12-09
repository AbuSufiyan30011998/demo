package com.resourceInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resourceInfo.entity.MasterResourceInfo;
import com.resourceInfo.service.MasterResourceInfoService;

@RestController
@RequestMapping("/mrscinfo")
@CrossOrigin(origins = "http://localhost:3000")
public class MasterResourceInfoController {
	
	@Autowired
	public MasterResourceInfoService masterResourceInfoService;
	
	@PostMapping("/master")
	public ResponseEntity<MasterResourceInfo> addNewTempRR(@RequestBody MasterResourceInfo rr) {
		System.out.println(rr.toString());
		return new ResponseEntity<MasterResourceInfo>(masterResourceInfoService.addNewResourseRequesitEntity(rr),HttpStatus.CREATED);
	}

}
