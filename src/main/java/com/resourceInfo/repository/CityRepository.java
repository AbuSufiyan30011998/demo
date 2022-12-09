package com.resourceInfo.repository;

import java.util.List;

import com.resourceInfo.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

import com.resourceInfo.entity.City;


public interface CityRepository  extends JpaRepository<City, Integer>  {

	public List<City> findByState1(State state);
	
}
