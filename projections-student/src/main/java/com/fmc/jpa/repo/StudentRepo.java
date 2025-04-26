package com.fmc.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fmc.jpa.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	Student findByName(String name);

	Student findByMarks(int marks);

	List<Student> findByMarksGreaterThan(int marks);

	List<Student> findByNameContaining(String keyword);

	interface StudentDetailsView{
		String getName();
		String getEmail();
	}
	
	List<StudentDetailsView> findByMarksLessThan(int marks);
	
	<T> List<T> findDetailsByName(String name, Class<T> stuClass);
	
}
