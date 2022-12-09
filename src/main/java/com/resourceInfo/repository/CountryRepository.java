package com.resourceInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resourceInfo.entity.Country;



public interface CountryRepository extends JpaRepository<Country, Integer> {
	public Country findByCountryName(String countryName);

}
