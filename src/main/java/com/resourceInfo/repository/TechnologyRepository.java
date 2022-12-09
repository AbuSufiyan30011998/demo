package com.resourceInfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resourceInfo.entity.DeveloperType;
import com.resourceInfo.entity.Technology;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TechnologyRepository extends JpaRepository<Technology,Integer> {

	@Query(value="select t.technology_id from technology t where t.technology_name =?",nativeQuery = true)
	public int findByTechnologyName(String technology_name);
	
	public List<Technology> findByResourceType1 (DeveloperType resourceType);


}
