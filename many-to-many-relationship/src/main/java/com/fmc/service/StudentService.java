package com.fmc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fmc.model.Course;
import com.fmc.model.Student;
import com.fmc.repo.StudentRepo;



@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public String addStudent(Student s) {
		repo.save(s);
		return "Student Added !";
	}
	
	public void addStudents(List<Student> students) {
		repo.saveAll(students);
	}
	
	public Student getStudentById(int id) {
		return repo.findById(id).orElse(new Student());
	}
	
	public String deleteStudentById(int id) {
		repo.deleteById(id);
		return "Student Deleted";
	}
	
	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	
	@Transactional
	public void printAllStudents() {
		List<Student> studs = repo.findAll();
		 for (Student s : studs) {
		        System.out.println("Student Name: " + s.getName());
		        for(Course e : s.getCourses() ) {
		        	System.out.println("Course name : "+e.getCourseName());
		        }
		    }
	}
	
}
