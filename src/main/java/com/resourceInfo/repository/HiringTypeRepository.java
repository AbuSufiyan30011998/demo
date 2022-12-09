package com.resourceInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resourceInfo.entity.HiringType;

@Repository
public interface HiringTypeRepository extends JpaRepository<HiringType, Long> {

}
