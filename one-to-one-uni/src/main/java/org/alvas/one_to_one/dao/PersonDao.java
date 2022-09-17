package org.alvas.one_to_one.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.one_to_one.dto.Aadhar;
import org.alvas.one_to_one.dto.Person;

public class PersonDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager;
	EntityTransaction entityTransaction;
	/*savePersonAndAadhar*/
	public Person savePerson(Person person,Aadhar aadhar)
	{ 
	entityManager=entityManagerFactory.createEntityManager();
	entityTransaction=entityManager.getTransaction();
	
	entityTransaction.begin();
entityManager.persist(person);
entityManager.persist(aadhar);

entityTransaction.commit();
System.out.println("......Data Stored.........");
	
	
return person;

		
	}
	public Person getPersonAadhar(int id)
	{
		entityManager =entityManagerFactory.createEntityManager();
		Person person=entityManager.find(Person.class,id);
		return person;
	}
	public Person deletePersonAadhar(int id)
	{
		entityManager =entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class,id);
	Aadhar aadhar=entityManager.find(Aadhar.class,person.getAadhar().getId());
		entityTransaction.begin();
		entityManager.remove(person);
		entityManager.remove(aadhar);
		entityTransaction.commit();
		System.out.println("......Data Deleted.........");
		return person;
	}
	public Person updatePersonAadhar(int id,String name,long aadharNumber)
	{
		entityManager =entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class,id);
	
	Aadhar aadhar=entityManager.find(Aadhar.class,person.getAadhar().getId());
	person.setName(name);
	aadhar.setAadharNumber(aadharNumber);
		entityTransaction.begin();
		entityManager.merge(person);
		entityManager.merge(aadhar);
		entityTransaction.commit();
		System.out.println("......Data Updated.........");
		return person;
	}
	
}
