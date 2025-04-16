package com.fmc.SpringJDBC;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fmc.SpringJDBC.model.Student;
import com.fmc.SpringJDBC.service.StudentService;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
		
		Student stu = context.getBean(Student.class);
		StudentService stuServ = context.getBean(StudentService.class);
		
		stu.setSid(104);
		stu.setName("Tharun");
		stu.setMarks(99);
		
		stuServ.addStudent(stu);
		List<Student> students = stuServ.getStudents();
		System.out.println(students);
	}

}
