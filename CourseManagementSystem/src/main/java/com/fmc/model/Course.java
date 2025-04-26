package com.fmc.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "course_p")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseId;
	private String courseName;
	private int durationInWeeks;
	
	@OneToMany(mappedBy = "course",fetch = FetchType.EAGER)
	private List<Enrollment> enrollments = new ArrayList<>();

	@Override
	public String toString() {
	
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", durationInWeeks=" + durationInWeeks
				+ "]";
	}
}
