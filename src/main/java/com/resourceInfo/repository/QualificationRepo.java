package com.resourceInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resourceInfo.entity.Qualification;

public interface QualificationRepo  extends JpaRepository<Qualification, Integer>  {
	
	public Qualification findByQualificationName(String qualificationName);

}
