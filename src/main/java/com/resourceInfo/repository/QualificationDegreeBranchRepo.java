package com.resourceInfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resourceInfo.entity.QualificationDegree;
import com.resourceInfo.entity.QualificationDegreeBranch;
import org.springframework.data.jpa.repository.Query;

public interface QualificationDegreeBranchRepo extends JpaRepository<QualificationDegreeBranch, Integer> {


	@Query(value = "select * from qly_specialization where degree_id = ?",nativeQuery = true)
	List<QualificationDegreeBranch> findQualificationDegreeBranchByDegreeName(int degree_id);
}
