package com.fmc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
