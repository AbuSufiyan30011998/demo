package com.resourceInfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resourceInfo.entity.Country;
import com.resourceInfo.entity.State;

public interface StateRepository extends JpaRepository<State, Integer> {
	
	public List<State> findByCountry1(Country country);
	public State findByStateName(String stateName);

}
