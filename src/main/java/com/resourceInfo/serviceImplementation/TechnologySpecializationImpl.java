package com.resourceInfo.serviceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceInfo.entity.TechnologySpecialization;
import com.resourceInfo.repository.TechnologyRepository;
import com.resourceInfo.repository.TechnologySpecialaizationRepository;
import com.resourceInfo.service.TechnologySpecializationService;

@Service
public class TechnologySpecializationImpl  implements TechnologySpecializationService{
	
	@Autowired
	public TechnologyRepository technologyRepository;
	
	@Autowired
	public TechnologySpecialaizationRepository technologySpecialaizationRepository;

	@Override
	public List<List<TechnologySpecialization>> getAllTechSpecializationsByTechnologyName(String technologyName) {
		List<List<TechnologySpecialization>> list = new ArrayList<>();
		int id = technologyRepository.findByTechnologyName(technologyName);
		list.add(technologySpecialaizationRepository.selectSpecializations(id));
		System.out.println(list);
		return list;
	}


}
