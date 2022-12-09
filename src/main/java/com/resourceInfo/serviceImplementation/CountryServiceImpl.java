package com.resourceInfo.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceInfo.entity.Country;
import com.resourceInfo.repository.CountryRepository;
import com.resourceInfo.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	public CountryRepository countryRepository;


	@Override
	public List<Country> getAllCountries() {
		
		return countryRepository.findAll();
	}

}
