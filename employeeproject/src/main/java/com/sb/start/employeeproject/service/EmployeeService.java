package com.sb.start.employeeproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.start.employeeproject.model.Employee;
import com.sb.start.employeeproject.repository.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public Employee getEmployee(Long empId) {
		return employeeDao.getEmp(empId);
	}

}
