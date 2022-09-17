package org.alvas.one_to_one.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.one_to_one.dto.Person;
import org.alvas.one_to_one.dto.Pan;

public class PersonDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("chinmai");
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public Person savePersonPan(Pan pan,Person person) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
	//	entityManager.persist(college);
		entityManager.persist(pan);
		entityManager.persist(person);
		entityTransaction.commit();
		return person;
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


