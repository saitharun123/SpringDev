package com.fmc.model;

import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
@Component
@Scope("prototype")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId;
	private String name;
	
	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Employee> employees;
	
	
}
