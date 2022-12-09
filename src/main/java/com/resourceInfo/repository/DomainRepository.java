package com.resourceInfo.repository;

import com.resourceInfo.entity.DomainKnowledge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DomainRepository extends JpaRepository<DomainKnowledge, Long> {

}
