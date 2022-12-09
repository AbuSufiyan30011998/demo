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

import com.resourceInfo.entity.DeveloperType;
import com.resourceInfo.service.DeveloperTypeService;

@RestController
@RequestMapping("/developer")
@CrossOrigin("*")
public class DeveloperTypeController {
	@Autowired
	public DeveloperTypeService developerTypeService;
	
	
	@GetMapping("/devType")
	public ResponseEntity<List<DeveloperType>> getAllResourceType() {
		return new ResponseEntity<List<DeveloperType>>( developerTypeService.getAllResourseTypes(), HttpStatus.OK);
	}

}
