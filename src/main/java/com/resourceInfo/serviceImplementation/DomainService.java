package com.resourceInfo.serviceImplementation;

import java.util.List;

import com.resourceInfo.entity.DomainKnowledge;
import com.resourceInfo.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DomainService {
	@Autowired
	private DomainRepository domainRepository;

	public List<DomainKnowledge> getAllDomains() {
		return this.domainRepository.findAll();
	}
}
