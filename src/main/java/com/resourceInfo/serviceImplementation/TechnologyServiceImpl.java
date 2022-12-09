package com.resourceInfo.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceInfo.entity.Technology;
import com.resourceInfo.repository.DeveloperTypeRepository;
import com.resourceInfo.repository.TechnologyRepository;
import com.resourceInfo.service.TechnologyService;

@Service
public class TechnologyServiceImpl  implements TechnologyService{

	@Autowired
	public TechnologyRepository technologyRepository;
	
	@Autowired
	public DeveloperTypeRepository developerTypeRepository;
	@Override
	public List<Technology> getAllTechnologiesByResourceTypeName(String resourceTypeName) {

		if(developerTypeRepository.findByResourceTypeName(resourceTypeName)!=null) {
			return technologyRepository.findByResourceType1(developerTypeRepository.findByResourceTypeName(resourceTypeName));
		}
		
		return null;
	}
	
	

}
