package com.resourceInfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resourceInfo.entity.QualificationDegree;
import com.resourceInfo.entity.Qualification;
import org.springframework.data.jpa.repository.Query;


public interface QualificationDegreeRepo extends JpaRepository<QualificationDegree, Integer> {

	@Query(value = "select degree_id from qly_degree where degree_name = ?", nativeQuery = true)
	public int findByDegreeName(String degree_name);

	public List<QualificationDegree> findByQualification1(Qualification qualification);

}
