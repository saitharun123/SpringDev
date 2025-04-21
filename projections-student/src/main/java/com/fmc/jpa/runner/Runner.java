package com.fmc.jpa.runner;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fmc.jpa.model.Student;
import com.fmc.jpa.repo.StudentRepo;
import com.fmc.jpa.repo.StudentRepo.StudentDetailsView;
import com.fmc.jpa.service.StudentService;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private StudentService service;
	@Autowired
	private ObjectProvider<Student> provider;
	@Override
	public void run(String... args) throws Exception {
		
		
		 Student s1 = provider.getObject();
		 Student s2 = provider.getObject();
		 Student s3 = provider.getObject();
		 Student s4 = provider.getObject();
		 Student s5 = provider.getObject();
		
		
		s1.setName("Tharun");
		s1.setMarks(80);
		s1.setEmail("Tharun@gmail.com");
		
		s2.setName("Srinu");
		s2.setMarks(75);
		s2.setEmail("srinu@gmail.com");
	
		s3.setName("Raju");
		s3.setMarks(50);
		s3.setEmail("raju@gmail.com");

		s4.setName("Madhu");
		s4.setMarks(70);
		s4.setEmail("madhu@gmail.com");
		
		s5.setName("Madhu");
		s5.setMarks(60);
		
		
		service.addStudent(s1);
		service.addStudent(s2);
		service.addStudent(s3);
		service.addStudent(s4);
		service.addStudent(s5);
		
		System.out.println("All Students : "+service.getStudents());
		System.out.println("Student By ID : "+service.getStudentById(2));
		System.out.println("Student By marks 70: "+service.getStudentByMarks(70));
		System.out.println("Students with marks greater than 50 : "+service.getStudentByMarksGreaterThan(50));
		System.out.println("Students name containing R : "+service.getStudentsLike("R") );
		
//		service.deleteStudentById(5);
//		System.out.println("Remaining Students : "+service.getStudents());
		
//		System.out.println("All Students details : "+service.getAllStudentDetails());
		List<StudentRepo.StudentDetailsView> details = service.getDetailsByName("Madhu");
		System.out.println("Madhu Details : "+details.getFirst().getName()+" : "+details.getFirst().getEmail());
		
		List<StudentDetailsView> marks = service.getByMarksLessThan(70);
		for(StudentDetailsView m : marks) {
			System.out.println(m.getName()+" : "+m.getEmail());
		}
	}

}
