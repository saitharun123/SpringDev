package com.fmc.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fmc.model.Course;
import com.fmc.model.Enrollment;
import com.fmc.model.Student;
import com.fmc.repo.CourseRepo;
import com.fmc.repo.EnrollmentRepo;
import com.fmc.repo.StudentRepo;
import com.fmc.service.CourseService;
import com.fmc.service.EnrollmentService;
import com.fmc.service.StudentService;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private StudentService stuService;
	
	@Autowired
	private CourseService courseServ;
	
	@Autowired
	private EnrollmentService enrollService;


  
	@Override
	public void run(String... args) throws Exception {
	
		Student s1 = new Student();
		s1.setName("Parthu");
		s1.setEmail("parthu@gmail.com");
		
		Student s2 = new Student();
		s2.setName("Chandra");
		s2.setEmail("chandra@gmail.com");
		
//		Course c1 = new Course();
//		c1.setCourseName("English");
//		c1.setDurationInWeeks(4);
//		
//		Course c2 = new Course();
//		c2.setCourseName("Maths");
//		c2.setDurationInWeeks(6);
		
		Course c1 = courseServ.getCourseById(1L);
		Course c2 = courseServ.getCourseById(2L);
		
		Enrollment e1 = new Enrollment();
		e1.setStudent(s1);
		e1.setCourse(c2);
		
		Enrollment e2 = new Enrollment();
		e2.setStudent(s2);
		e2.setCourse(c1);
		
//		courseServ.addCourse(c2);
//		courseServ.addCourse(c1);
//		
//		stuService.addStudent(s1);
//		stuService.addStudent(s2);
//		
//		enrollService.addEnrollment(e2);
//		enrollService.addEnrollment(e1);
		
			
		List<StudentRepo.StudentDetailsView> stuDetails = stuService.getStudentDetails("Tharun");
		stuDetails.stream().forEach(s -> System.out.println(s.getName()+" : "+s.getEmail()));
		
		List<EnrollmentRepo.EnrollmentDetailsView> enrolls = enrollService.getEnrollmentDetailsByStudId(3L);
		enrolls.forEach(e -> System.out.println(e.getClass().getName()+" : "+e.getStudent().getName()+" : "+e.getCourse().getCourseName()+" : "+e.getCourse()));
		
		Enrollment enroll = enrollService.getEnrollmentById(3L);
		
		System.out.println(enroll.getCourse());
	}



}
