package com.fmc.SpringJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmc.SpringJDBC.model.Student;
import com.fmc.SpringJDBC.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo repository;
	
	public StudentRepo getRepo() {
		return repository;
	}
	
	public void addStudent(Student s) {
		 repository.save(s);
	}
	
	public List<Student> getStudents(){
		return repository.findAll();
	}
	
}
