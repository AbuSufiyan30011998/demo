package com.resourceInfo.serviceImplementation;

import java.util.List;

import com.resourceInfo.service.HiringTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceInfo.entity.HiringType;
import com.resourceInfo.repository.HiringTypeRepository;

@Service
public class HiringServiceImpl implements HiringTypeService {
	@Autowired
	HiringTypeRepository hiringTypeRepository;

    @Override
    public List<HiringType>getAllHiringType()
   {
	   return hiringTypeRepository.findAll();
   }

}
