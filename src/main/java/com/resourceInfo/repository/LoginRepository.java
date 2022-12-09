package com.resourceInfo.repository;

import com.resourceInfo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface LoginRepository extends JpaRepository<Employee, Long>{

	@Query(value = "select * from employee where employee_email=?", nativeQuery = true)
	Employee find(String employee_email);

}
