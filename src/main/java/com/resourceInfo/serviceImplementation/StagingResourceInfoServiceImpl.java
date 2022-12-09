package com.resourceInfo.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceInfo.entity.StagingResourseInfo;
import com.resourceInfo.repository.StagingResourceInfoRepo;
import com.resourceInfo.service.StagingResourceInfoService;

@Service
public class StagingResourceInfoServiceImpl implements StagingResourceInfoService{
	
	@Autowired
	public StagingResourceInfoRepo stagingResourceInfoRepo;

	@Override
	public StagingResourseInfo addNewResourseRequesitEntity(StagingResourseInfo trr) {
	
		return stagingResourceInfoRepo.save(trr);
	}

}
