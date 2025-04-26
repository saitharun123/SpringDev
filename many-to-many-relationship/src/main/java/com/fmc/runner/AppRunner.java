package com.fmc.runner;

import java.util.Arrays;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fmc.model.Course;
import com.fmc.model.Student;
import com.fmc.service.CourseService;
import com.fmc.service.StudentService;

@Component
public class AppRunner implements CommandLineRunner {

  
	@Autowired
	private StudentService stuService;
	
	@Autowired
	private CourseService cService;
	
	@Override
	public void run(String... args) throws Exception {

//		Student s1 = new Student();
//		s1.setName("Manoj");
//		
//		Student s2 = new Student();
//		s2.setName("Mithun");
//		
//		Student s3 = new Student();
//		s3.setName("Sai");
//		
//		Student s4 = new Student();
//		s4.setName("lalli");
//		
//		
//		Course c1 = new Course();
//		c1.setCourseName("Maths");
//		
//		
//		Course c2 = new Course();
//		c2.setCourseName("Science");
//		
//		
//		Course c3 = new Course();
//		c3.setCourseName("English");
//		
//		s1.setCourses(Set.of(c1,c2));
//		
//		s2.setCourses(Set.of(c2));
//		s3.setCourses(Set.of(c2,c3));
//		s4.setCourses(Set.of(c1,c3));
//		
//		stuService.addStudents(Arrays.asList(s1,s2,s3,s4));
//		cService.addCourses(Arrays.asList(c1,c2,c3));
//		
		
//		stuService.deleteStudentById(1);
		stuService.printAllStudents();
		
	}

}
