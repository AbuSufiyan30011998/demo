package com.resourceInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resourceInfo.entity.TimeZone;

public interface TimeZoneRepository extends JpaRepository<TimeZone, Integer> {

}
