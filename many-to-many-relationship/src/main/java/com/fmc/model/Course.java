package com.fmc.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Course {

	@Id
	@GeneratedValue
	private int courseId;
	private String courseName;
	
	@ManyToMany(mappedBy ="courses")
	private List<Student> students;
}
