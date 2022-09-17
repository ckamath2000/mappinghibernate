package org.alvas.many_to_one.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.many_to_one.dto.College;
import org.alvas.many_to_one.dto.Building;

public class CollegeDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("chinmai");
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public Building saveBuildingCollege(College college,Building building1,Building building2) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
	//	entityManager.persist(college);
		entityManager.persist(building1);
		entityManager.persist(building2);
		entityTransaction.commit();
		return building1;
	}
}
//
//	public Student updateMobileSim(int id, String name, String serviceprovider,String simname) {
//		Student mobile = entityManager.find(Student.class, id);
//		mobile.setName(name);
//		entityTransaction.begin();
//		for (Subject s : mobile.getList()) {
//			if(s.getName().equals(simname)) {
//			s.setProvider(serviceprovider);
//			entityManager.merge(s);
//			}
//		}
//		entityManager.merge(mobile);
//		entityTransaction.commit();
//		return mobile;
//	}
//
//	public Student getById(int id) {
//		Student mobile = entityManager.find(Student.class, id);
//		return mobile;
//	}
//
//	public Student deleteById(int id) {
//		Student mobile = entityManager.find(Student.class, id);
//		entityTransaction.begin();
//		for (Subject s : mobile.getList()) {
//			entityManager.remove(s);
//		}
//		entityManager.remove(mobile);
//		entityTransaction.commit();
//		return mobile;
//	}


