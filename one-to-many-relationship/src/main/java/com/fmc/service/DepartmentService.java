package com.fmc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fmc.model.Department;
import com.fmc.model.Employee;
import com.fmc.repo.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repo;
	
	public void addDepartment(Department d) {
		repo.save(d);
	}
	
	public List<Department> getDepartments(){
		return repo.findAll();
	}
	
	public String deleteDepartmentById(int id) {
		repo.deleteById(id);
		return "Department deleted";
	}
	
	public Department getDepartmentById(int id) {
		return repo.findById(id).orElse(new Department());
		
	}
	
	@Transactional
	public void printAllDepartments() {
	    List<Department> departments = repo.findAll();
	    for (Department d : departments) {
	        System.out.println("Dept Name: " + d.getName());
	        for(Employee e : d.getEmployees() ) {
	        	System.out.println("Employee name : "+e.getName());
	        }
	    }
	}
}
