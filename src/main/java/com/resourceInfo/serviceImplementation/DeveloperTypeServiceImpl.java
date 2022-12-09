package com.resourceInfo.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceInfo.entity.DeveloperType;
import com.resourceInfo.repository.DeveloperTypeRepository;
import com.resourceInfo.service.DeveloperTypeService;

@Service
public class DeveloperTypeServiceImpl implements DeveloperTypeService {
	@Autowired
	public DeveloperTypeRepository developerTypeRepository;


	@Override
	public List<DeveloperType> getAllResourseTypes() {
		return developerTypeRepository.findAll();
	}
	

}
