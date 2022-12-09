package com.resourceInfo.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.resourceInfo.entity.Technology;
import com.resourceInfo.entity.TechnologySpecialization;

public interface TechnologySpecialaizationRepository extends JpaRepository<TechnologySpecialization, Integer> {

	@Query(value="select * from technology_specialization where technology_id = ?",nativeQuery =true)
	List<TechnologySpecialization> selectSpecializations(int technology_id);
	
}
