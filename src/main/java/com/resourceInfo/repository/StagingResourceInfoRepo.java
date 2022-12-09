package com.resourceInfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.resourceInfo.entity.Employee;
import com.resourceInfo.entity.StagingResourseInfo;
import org.springframework.data.jpa.repository.Query;

public interface StagingResourceInfoRepo extends JpaRepository<StagingResourseInfo, Integer> {
	
	@Query(value="select * from  stg_resource_info where employee_id = ?", nativeQuery = true)
	List<StagingResourseInfo> findId(int employeeId);

    @Query(value="delete from stg_resource_info where employee_id=?", nativeQuery = true)
    @Modifying
    void deleteAllById(int employeeId);
    
}
