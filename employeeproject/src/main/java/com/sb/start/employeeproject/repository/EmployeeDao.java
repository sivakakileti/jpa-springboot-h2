package com.sb.start.employeeproject.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sb.start.employeeproject.model.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	EmployeeRep empRepo;
	//this is to fetch employee data 
	public Employee getEmp(Long id) {
		return empRepo.getById(id);
		
	}
	
	
	

}
