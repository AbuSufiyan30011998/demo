package com.resourceInfo.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceInfo.entity.QualificationDegree;
import com.resourceInfo.repository.QualificationDegreeRepo;
import com.resourceInfo.repository.QualificationRepo;
import com.resourceInfo.service.QualificationDegreeService;


@Service
public class QualificationDegreeServiceImpl  implements QualificationDegreeService{

	
	@Autowired
	public QualificationDegreeRepo qualificationDegreeRepo;
	
	@Autowired
	public QualificationRepo qualificationRepo;

	@Override
	public QualificationDegree getQly_DegreeById(int qly_degreeId) {
		if(qualificationDegreeRepo.existsById(qly_degreeId))
		{
			return qualificationDegreeRepo.findById(qly_degreeId).get();
			}
		return null;
	}

	@Override
	public List<QualificationDegree> getAllDegrees() {
		
		return qualificationDegreeRepo.findAll();
	}

	@Override
	public List<QualificationDegree> getAllDegreesByQualificationName(String qualificationName) {
		if(qualificationRepo.findByQualificationName(qualificationName)!=null) {
			return qualificationDegreeRepo.findByQualification1(qualificationRepo.findByQualificationName(qualificationName));
		}
		return null;
	}

}
