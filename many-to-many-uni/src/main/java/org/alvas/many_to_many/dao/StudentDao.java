package org.alvas.many_to_many.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.many_to_many.dto.Student;
import org.alvas.many_to_many.dto.Subject;
import org.alvas.one_to_many.dto.Mobile;
import org.alvas.one_to_many.dto.Sim;

public class StudentDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("chinmai");
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public List<Student> saveStudentSubject(List<Student> slist, List<Subject> list) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		for (Student student2 : slist) {
			for (Subject subjects2 : list) {
				entityManager.persist(subjects2);
			}
			entityManager.persist(student2);
		}
		entityTransaction.commit();
		return slist;
	}

	public List<Student> updateStudentSubject(int id, String name, String subname,String subauthor) {
		Student student = entityManager.find(Student.class, id);
		student.setStudentName(name);
		entityTransaction.begin();
		for (Subject s : student.getSubject()) {
			if(s.getName().equals(simname)) {
			s.setProvider(serviceprovider);
			entityManager.merge(s);
			}
		}
		entityManager.merge(mobile);
		entityTransaction.commit();
		return mobile;
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


