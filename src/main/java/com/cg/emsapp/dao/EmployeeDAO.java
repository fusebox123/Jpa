package com.cg.emsapp.dao;
import java.util.List;

import com.cg.emsapp.domain.Employee;

public interface EmployeeDAO {

	void create(Employee employee);
	void update(Employee employee);
	void delete(Employee employee);
	List<Employee> findAll();
}
