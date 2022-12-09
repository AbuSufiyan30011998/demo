package com.resourceInfo.service;

import java.util.List;

import com.resourceInfo.entity.Qualification;

public interface QualificationService {


	public Qualification getQualificationEntityById(int qualificationid);
	public List<Qualification> getAllQualifications();
	
	
}
