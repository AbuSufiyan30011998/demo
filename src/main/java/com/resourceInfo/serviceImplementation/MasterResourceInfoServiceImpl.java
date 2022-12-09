package com.resourceInfo.serviceImplementation;

import com.resourceInfo.repository.StagingResourceInfoRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.resourceInfo.entity.MasterResourceInfo;
import com.resourceInfo.entity.StagingResourseInfo;
import com.resourceInfo.repository.MasterResourceInfoRepository;
import com.resourceInfo.service.MasterResourceInfoService;

@Service
public class MasterResourceInfoServiceImpl implements MasterResourceInfoService{
	
	@Autowired
	private MasterResourceInfoRepository masterResourceInfoRepository;
	
	@Autowired
	private StagingResourceInfoRepo stagingResourceInfoRepo;

	@Override
	@Transactional
	public MasterResourceInfo addNewResourseRequesitEntity(MasterResourceInfo resourceInfo) {
		int id = resourceInfo.getEmployee().getEmployeeId();
		//System.out.println("id = "+id);
		List<StagingResourseInfo> emp = stagingResourceInfoRepo.findId(id);
		//System.out.println("emp = "+emp.toString());
		if(emp != null)
			stagingResourceInfoRepo.deleteAllById(id);
		return masterResourceInfoRepository.save(resourceInfo);
	}

}
