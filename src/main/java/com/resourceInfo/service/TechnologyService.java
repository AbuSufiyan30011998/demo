package com.resourceInfo.service;

import java.util.List;

import com.resourceInfo.entity.Technology;

public interface TechnologyService {


	public List<Technology> getAllTechnologiesByResourceTypeName(String resourceTypeName);
}
