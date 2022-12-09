package com.resourceInfo.serviceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceInfo.entity.QualificationDegreeBranch;
import com.resourceInfo.repository.QualificationDegreeRepo;
import com.resourceInfo.repository.QualificationDegreeBranchRepo;
import com.resourceInfo.service.QualificationDegreeBranchService;

@Service
public class QualificationDegreeBranchServiceImpl implements QualificationDegreeBranchService{
	
	@Autowired
	public QualificationDegreeBranchRepo qualificationDegreeBranchRepo;
	
	@Autowired
	public QualificationDegreeRepo qualificationDegreeRepo;

	@Override
	public List<QualificationDegreeBranch> getAllSpecializations() {
		return qualificationDegreeBranchRepo.findAll();
	}

	@Override
	public List<QualificationDegreeBranch> getAllSpecializationsByDegreeName(String degreeName) {
	//	List<QualificationDegreeBranch> list = new ArrayList<>();
		int id = qualificationDegreeRepo.findByDegreeName(degreeName);
		//list.add(qualificationDegreeBranchRepo.findQualificationDegreeBranchByDegreeName(degreeName));
		return qualificationDegreeBranchRepo.findQualificationDegreeBranchByDegreeName(id);
	}

}
