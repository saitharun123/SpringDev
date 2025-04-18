package com.fmc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fmc.model.Employee;
import com.fmc.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public void addEmployee(Employee e) {
		repo.save(e);
	}
	
	@Transactional
	public List<Employee> getEmployees(){
		return repo.findAll();
	}
	
	public String deleteEmployeeById(int id) {
		repo.deleteById(id);
		return "employee deleted";
	}
	
	@Transactional
	public void printAllEmployees() {
	    List<Employee> employees = repo.findAll();
	    for (Employee e : employees) {
	        System.out.println("Emp Name: " + e.getName() +
	                           ", Dept: " + (e.getDept() != null ? e.getDept().getName() : "None"));
	    }
	}
}
