package org.alvas.one_to_one.controller;



import org.alvas.one_to_one.dao.PersonDao;
import org.alvas.one_to_one.dto.Person;
import org.alvas.one_to_one.dto.Pan;

public class PersonController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDao personDao=new PersonDao();
	Pan pan=new Pan();
	Person person=new Person();
	pan.setPanNumber("CBENCG0768");
	pan.setPanAddress("Hyderbad");
	

person.setPersonName("Kamal");
person.setPersonEmail("kamal123@gmail.com");
pan.setPerson(person);
personDao.savePersonPan(pan,person);
	}

}