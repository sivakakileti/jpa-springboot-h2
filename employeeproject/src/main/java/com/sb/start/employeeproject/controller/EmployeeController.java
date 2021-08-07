package com.sb.start.employeeproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.start.employeeproject.model.Employee;
import com.sb.start.employeeproject.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/getEmp/{empId}")
	public Employee getEmployee(@PathVariable Long empId) {
		return employeeService.getEmployee(empId);
	}

}
