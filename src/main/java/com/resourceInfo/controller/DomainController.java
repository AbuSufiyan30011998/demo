package com.resourceInfo.controller;

import java.util.List;

import com.resourceInfo.entity.DomainKnowledge;
import com.resourceInfo.serviceImplementation.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/viewDomains")
@RestController
@CrossOrigin("*")
public class DomainController {

	@Autowired
	private DomainService domainService;

	@GetMapping("/")
	public ResponseEntity<List<DomainKnowledge>> getAllDomains() {
		List<DomainKnowledge> domains = this.domainService.getAllDomains();
		return new ResponseEntity<List<DomainKnowledge>>(domains, HttpStatus.OK);
	}

}
