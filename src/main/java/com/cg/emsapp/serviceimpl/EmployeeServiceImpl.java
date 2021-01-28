package com.cg.emsapp.serviceimpl;

import java.util.List;

import com.cg.emsapp.dao.EmployeeDAO;
import com.cg.emsapp.daoimpl.EmployeeDAOImpl;
import com.cg.emsapp.domain.Employee;
import com.cg.emsapp.service.EmployeeService;
import com.cg.emsapp.util.DBUtil;

public class EmployeeServiceImpl extends DBUtil implements EmployeeService {
	 
	private EmployeeDAO employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new EmployeeDAOImpl();
	}
	
	@Override
	public void create(Employee employee) {
//		entityManager.getTransaction().begin();
		employeeDao.create(employee);
//		entityManager.getTransaction().commit();
//		entityManager.close();
//		entityManagerFactory.close();
		
		
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
