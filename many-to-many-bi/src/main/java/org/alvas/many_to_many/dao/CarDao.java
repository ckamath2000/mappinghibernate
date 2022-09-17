package org.alvas.many_to_many.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.many_to_many.dto.Car;
import org.alvas.many_to_many.dto.Feature;

public class CarDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("chinmai");
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public List<Car> saveCar(List<Car> cars,List<Feature> features) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
	
		for(Feature feature:features)
		{
			entityManager.persist(feature);
		}
		for(Car car:cars)
		{
			entityManager.persist(car);
		}
		entityTransaction.commit();
		return cars;
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


