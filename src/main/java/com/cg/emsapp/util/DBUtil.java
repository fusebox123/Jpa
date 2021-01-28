package com.cg.emsapp.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	public EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	public EntityManager entityManager = entityManagerFactory.createEntityManager();

}
