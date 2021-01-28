package com.cg.emsapp.daoimpl;

import java.util.List;

import com.cg.emsapp.dao.EmployeeDAO;
import com.cg.emsapp.domain.Employee;
import com.cg.emsapp.util.DBUtil;

public class EmployeeDAOImpl extends DBUtil implements EmployeeDAO {

	@Override
	public void create(Employee employee) {
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
