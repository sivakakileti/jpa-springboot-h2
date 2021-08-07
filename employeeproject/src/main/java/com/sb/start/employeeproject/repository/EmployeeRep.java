package com.sb.start.employeeproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.start.employeeproject.model.Employee;

public interface EmployeeRep extends JpaRepository<Employee, Long>{

}
