package com.resourceInfo.service;

import java.util.List;

import com.resourceInfo.entity.TechnologySpecialization;

public interface TechnologySpecializationService {

	public List<List<TechnologySpecialization>> getAllTechSpecializationsByTechnologyName(String technologyName);

	//public List<TechnologySpecialization> getAllTechSpecializationsByTechnologyNames(List<Integer> ids );
	

}
