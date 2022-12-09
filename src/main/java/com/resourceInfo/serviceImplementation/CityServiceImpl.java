package com.resourceInfo.serviceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceInfo.entity.City;
import com.resourceInfo.repository.CityRepository;
import com.resourceInfo.repository.StateRepository;
import com.resourceInfo.service.CityService;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	public CityRepository cityRepository;
	
	@Autowired 
	public StateRepository stateRepository;
	


	@Override
	public List<City> getAllCitiesByState(String stateName) {
		if(stateRepository.findByStateName(stateName)!=null) {
		return cityRepository.findByState1(stateRepository.findByStateName(stateName));
		}
		return new ArrayList<City>();
	}
	

}
