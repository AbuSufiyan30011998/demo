package com.resourceInfo.serviceImplementation;

import java.util.List;

import com.resourceInfo.entity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceInfo.repository.CountryRepository;
import com.resourceInfo.repository.StateRepository;
import com.resourceInfo.service.StateService;

@Service
public class StateServiceImpl implements StateService{

	@Autowired
	public StateRepository stateRepository;
	
	@Autowired
	public CountryRepository countryRepository;

	@Override
	public List<State> getAllStatesOfCountry(String countryName) {

		if(countryRepository.findByCountryName(countryName)!=null) {
		return stateRepository.findByCountry1(countryRepository.findByCountryName(countryName));}
		
		return null;
	}

}
