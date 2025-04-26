package com.fmc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

	interface StudentDetailsView{
		String getName();
		String getEmail();
	}	
	
	<T> List<T> findByName(String name, Class<T> stuClass);
	

}
