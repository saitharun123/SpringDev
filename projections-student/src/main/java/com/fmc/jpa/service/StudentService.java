package com.fmc.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmc.jpa.model.Student;
import com.fmc.jpa.repo.StudentRepo;
import com.fmc.jpa.repo.StudentRepo.StudentDetailsView;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public StudentRepo getRepo() {
		return repo;
	}
	
	@Autowired
	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}
	
	public void addStudent(Student s) {
		repo.save(s);
	}
	public List<Student> getStudents(){
		return repo.findAll();
	}
	
	public Student getStudentById(int id){
		return repo.findById(id).orElse(new Student());
	}
	
	public Student getStudentByName(String name) {
		return repo.findByName(name);
	}
	
	public Student getStudentByMarks(int marks) {
		return repo.findByMarks(marks);
		
	}
	
	public List<Student> getStudentByMarksGreaterThan(int marks) {
		return repo.findByMarksGreaterThan(marks);
	}
	
	public List<Student> getStudentsLike(String keyword) {
		return repo.findByNameContaining(keyword);
	}
	
	public void deleteStudentById(int id) {
		repo.deleteById(id);
	}
	
	
//	public List<StudentRepo.StudentDetailsView> getAllStudentDetails(){
//		return repo.getAllStudentsDetails();
//	}
	
	public List<StudentRepo.StudentDetailsView> getDetailsByName(String name){
		return repo.findDetailsByName(name, StudentRepo.StudentDetailsView.class);
	}

	public List<StudentDetailsView> getByMarksLessThan(int i) {
		// TODO Auto-generated method stub
		return repo.findByMarksLessThan(i);
	}
}
