package com.resourceInfo.service;

import java.util.List;

import com.resourceInfo.entity.QualificationDegree;

public interface QualificationDegreeService {
	

	public QualificationDegree getQly_DegreeById(int qly_degreeId);
	
	public List<QualificationDegree> getAllDegrees();
	public List<QualificationDegree> getAllDegreesByQualificationName(String qualificationName );


}
