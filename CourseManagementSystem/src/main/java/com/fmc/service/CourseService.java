package com.fmc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmc.model.Course;
import com.fmc.repo.CourseRepo;

@Service
public class CourseService {

	@Autowired
	private CourseRepo repo;
	
	public void addCourse(Course c) {
		repo.save(c);
	}
	
	public Course getCourseById(Long id) {
		return repo.findById(id).orElse(new Course());
	}
	
	public List<Course> getCourses(){
		return repo.findAll();
	}
	
	public void deleteCourse(Long id) {
		repo.deleteById(id);
	}
	
	public List<CourseRepo.CourseDetailsView> getCourseDetailsById(Long id){
		return repo.findByCourseId(id);
	}
}
