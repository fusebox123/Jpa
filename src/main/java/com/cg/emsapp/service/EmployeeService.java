package com.cg.emsapp.service;

import java.util.List;

import com.cg.emsapp.domain.Employee;

public interface EmployeeService {
	void create(Employee employee);
	void delete(Employee employee);
	void update(Employee employee);
	List<Employee> findAll();

}
