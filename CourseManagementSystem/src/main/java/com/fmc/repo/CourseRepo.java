package com.fmc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.model.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {

	interface CourseDetailsView{
		String getCourseName();
		int getDurationInWeeks();
	}
	
	List<CourseDetailsView> findByCourseId(Long id);
}
