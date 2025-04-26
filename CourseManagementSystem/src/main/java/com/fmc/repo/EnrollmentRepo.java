package com.fmc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.model.Course;
import com.fmc.model.Enrollment;

public interface EnrollmentRepo extends JpaRepository<Enrollment, Long>{

	interface EnrollmentDetailsView{
		StudentName getStudent();
		CourseName getCourse();
		
		interface StudentName{
			String getName();
		}
		interface CourseName{
			String getCourseName();
		}
	}
	
	List<EnrollmentDetailsView> findByEnrollmentId(Long id);
	
	List<EnrollmentDetailsView> findByStudentId(Long id);
}
