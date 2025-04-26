package com.fmc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmc.model.Student;
import com.fmc.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public void addStudent(Student s) {
		repo.save(s);
	}
	public Student getStudentById(Long id) {
		return repo.findById(id).orElse(new Student());
	}
	
	public List<Student> getStudents(){
		return repo.findAll();
	}
	
	public void deleteStudent(Long id) {
		repo.deleteById(id);
	}
	
	public List<StudentRepo.StudentDetailsView> getStudentDetails(String name){
		return repo.findByName(name, StudentRepo.StudentDetailsView.class);
	}


}
