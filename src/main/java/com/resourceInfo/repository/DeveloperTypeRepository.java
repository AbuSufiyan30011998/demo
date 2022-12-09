package com.resourceInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resourceInfo.entity.DeveloperType;

public interface DeveloperTypeRepository extends JpaRepository<DeveloperType, Integer>{
	public DeveloperType findByResourceTypeName(String resourceTypeName);

}
