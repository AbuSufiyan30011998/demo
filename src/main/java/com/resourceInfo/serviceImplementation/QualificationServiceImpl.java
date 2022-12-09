package com.resourceInfo.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceInfo.entity.Qualification;
import com.resourceInfo.repository.QualificationRepo;
import com.resourceInfo.service.QualificationService;

@Service
public class QualificationServiceImpl implements QualificationService {
	
	@Autowired
	public QualificationRepo qualificationRepo;

	@Override
	public Qualification getQualificationEntityById(int qualificationid) {
		
		if(qualificationRepo.existsById(qualificationid))
		{
			System.out.println("inside");
			return qualificationRepo.findById(qualificationid).get();
			
		}
		return null;
	}

	@Override
	public List<Qualification> getAllQualifications() {
		return qualificationRepo.findAll();
	}
	
	
}
