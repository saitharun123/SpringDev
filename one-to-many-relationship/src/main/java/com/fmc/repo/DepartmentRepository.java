package com.fmc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fmc.model.Department;

@Repository	
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
