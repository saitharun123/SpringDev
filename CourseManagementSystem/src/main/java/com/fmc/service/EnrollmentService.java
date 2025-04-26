package com.fmc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmc.model.Enrollment;
import com.fmc.repo.EnrollmentRepo;

@Service
public class EnrollmentService {

	@Autowired
	private EnrollmentRepo repo;
	
	public void addEnrollment(Enrollment e) {
		repo.save(e);
	}
	public Enrollment getEnrollmentById(Long id) {
		return repo.findById(id).orElse(new Enrollment());
	}
	
	public List<Enrollment> getEnrollments(){
		return repo.findAll();
	}
	
	public void deleteEnrollment(Long id) {
		repo.deleteById(id);
	}
	
	public List<EnrollmentRepo.EnrollmentDetailsView> getEnrollmentDetailsById(Long id){
		return repo.findByEnrollmentId(id);
	}
	
	public List<EnrollmentRepo.EnrollmentDetailsView> getEnrollmentDetailsByStudId(Long id){
		return repo.findByStudentId(id);
	}
	

}
