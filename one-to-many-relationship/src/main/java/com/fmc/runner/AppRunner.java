package com.fmc.runner;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fmc.model.Department;
import com.fmc.model.Employee;
import com.fmc.repo.DepartmentRepository;
import com.fmc.service.DepartmentService;
import com.fmc.service.EmployeeService;

import jakarta.transaction.Transactional;

@Component
public class AppRunner implements CommandLineRunner {


	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private DepartmentService deptService;
	
	@Autowired
	private ObjectProvider<Employee> empProvider;
	
	@Autowired
	private ObjectProvider<Department> deptProvider;

   
	
  
	@Override
	public void run(String... args) throws Exception {
		Department it = deptService.getDepartmentById(2);

//
		Department sales = deptService.getDepartmentById(3);

//
//		
//		Department dept3 = deptProvider.getObject();
//		
//		dept3.setName("Marketing");
//	
		Employee emp1 = empProvider.getObject();
		Employee emp2 = empProvider.getObject();
//		Employee emp3 = empProvider.getObject();
//		Employee emp4 = empProvider.getObject();
//		
//		
		emp1.setName("Mithun");
		emp1.setDept(it);
		

		emp2.setName("Manoj");
		emp2.setDept(sales);
//		
//		emp3.setName("Hanish");
//		emp3.setDepartment(dept3);
//	
//		emp4.setName("Partha");
//		emp4.setDepartment(dept);
//
//		deptService.addDepartment(dept3);
//		
//		empService.addEmployee(emp1);
//		empService.addEmployee(emp2);
//		empService.addEmployee(emp3);
//		empService.addEmployee(emp4);
		
		
//		deptService.deleteDepartmentById(4);
		
//		empService.printAllEmployees();
//		deptService.printAllDepartments();
		
		//Printing this whole object leads to stack overflow error, store it in a variable and print only required fields instead of whole object
//		System.out.println(empService.getEmployees());
		
		Department dept = deptService.getDepartmentById(2);
		System.out.println("Department: " + dept.getName());
		dept.getEmployees().forEach(emp -> System.out.println("Employee: " + emp.getName()));
	}

}
