package com.resourceInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resourceInfo.entity.MasterResourceInfo;

public interface MasterResourceInfoRepository extends JpaRepository<MasterResourceInfo, Integer> {

}
