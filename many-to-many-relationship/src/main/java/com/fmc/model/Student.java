package com.fmc.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	@ManyToMany(cascade = CascadeType.PERSIST)//, fetch = FetchType.LAZY)
	@JoinTable(name = "Student_Courses",
			joinColumns = @JoinColumn(name="student_id"),
			inverseJoinColumns = @JoinColumn(name = "course_id"))
	private Set<Course> courses;
}
