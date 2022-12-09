package com.resourceInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resourceInfo.entity.StagingResourseInfo;
import com.resourceInfo.service.StagingResourceInfoService;

@RestController
@RequestMapping("/stg")
@CrossOrigin("*")
public class StagingResourceInfoController {
	@Autowired
	public StagingResourceInfoService stagingResourceInfoService;
	
	@PostMapping("/stgtbl")
	public ResponseEntity<StagingResourseInfo> addNewTempRR(@RequestBody StagingResourseInfo trr) {
		System.out.println(trr.toString());
		return new ResponseEntity<StagingResourseInfo>(stagingResourceInfoService.addNewResourseRequesitEntity(trr),HttpStatus.CREATED);
	}
	
	

}
