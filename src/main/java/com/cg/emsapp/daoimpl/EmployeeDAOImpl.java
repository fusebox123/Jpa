package com.cg.emsapp.daoimpl;

import java.util.List;

import com.cg.emsapp.dao.EmployeeDAO;
import com.cg.emsapp.domain.Employee;
import com.cg.emsapp.util.DBUtil;
import com.cruddemo.model.UserDetail;

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
		

	}

	@Override
	public void delete(Employee employee) {
//		entityManager.getTransaction().begin();
//		entityManager.find(Employee.class,employee.getId());
//		entityManager.remove(employee);
//		entityManager.getTransaction().commit();
//		entityManager.close();
//		entityManagerFactory.close();

	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
