package com.resourceInfo.service;

import java.util.List;

import com.resourceInfo.entity.QualificationDegreeBranch;


public interface QualificationDegreeBranchService {
	
	public List<QualificationDegreeBranch> getAllSpecializations();
	public List<QualificationDegreeBranch> getAllSpecializationsByDegreeName(String degreeName );


}
