package com.fmc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.model.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

}
