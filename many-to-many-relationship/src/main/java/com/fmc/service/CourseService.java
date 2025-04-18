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
	
	public String addCourse(Course c) {
		repo.save(c);
		return "Course Added !";
	}
	
	public void addCourses(List<Course> courses) {
		repo.saveAll(courses);
	}
	public Course getCoursetById(int id) {
		return repo.findById(id).orElse(new Course());
	}
	
	public String deleteCourseById(int id) {
		repo.deleteById(id);
		return "Course Deleted";
	}
	
	public List<Course> getAllCourses(){
		return repo.findAll();
	}
}
