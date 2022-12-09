package com.resourceInfo.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceInfo.entity.TimeZone;
import com.resourceInfo.repository.TimeZoneRepository;
import com.resourceInfo.service.TimeZoneService;

@Service
public class TimeZoneServiceImpl implements TimeZoneService{
	
	@Autowired
	 private TimeZoneRepository timeZoneRepository;

	@Override
	public List<TimeZone> getAllTimeZones() {
		return timeZoneRepository.findAll();
	}

}
