package org.alvas.one_to_one.controller;

import java.util.List;
import java.util.Scanner;

import org.alvas.one_to_one.dao.PersonDao;
import org.alvas.one_to_one.dto.Aadhar;
import org.alvas.one_to_one.dto.Person;



public class PersonController {
	static	Person person;
	static	PersonDao personDao=new PersonDao();
	static	Aadhar aadhar;
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
		while(true)
		{
			System.out.println("1.Save PersonAadhar");
			System.out.println("2.get PersonAadhar");
			System.out.println("3.delete PersonAadhar");
			System.out.println("4.update PersonAadhar");
			System.out.println("Enter your choice");
			int ch=scanner.nextInt();
			switch(ch)
			{
			case 1:
			{ aadhar=new Aadhar();
			person=new Person();
				aadhar.setAadharNumber(23456789);
				aadhar.setAddress("Bengaluru");
				person.setName("Abhi");
				person.setEmail("abhi@gmail.com");
				person.setAadhar(aadhar);
				personDao.savePerson(person,aadhar);
			}
				
			
			break;
		
			case 2:
			{
				Person person=personDao.getPersonAadhar(1);
				System.out.println("Person Details");
				System.out.println(person.getId()+"\t"+person.getName()+"\t"+person.getEmail());
				System.out.println("Aadhar Details");
				System.out.println(person.getAadhar().getId());
				System.out.println(person.getAadhar().getAadharNumber());
				System.out.println(person.getAadhar().getAddress());
			}
			break;
			case 3:
			{
				Person person=personDao.deletePersonAadhar(1);
				System.out.println("Person Details");
				System.out.println(person.getId()+"\t"+person.getName()+"\t"+person.getEmail());
				System.out.println("Aadhar Details");
				System.out.println(person.getAadhar().getId());
				System.out.println(person.getAadhar().getAadharNumber());
				System.out.println(person.getAadhar().getAddress());
			}
			break;
			case 4:
			{
				Person person=personDao.updatePersonAadhar(2,"Ravi",768089012);
				System.out.println("Person Details");
				System.out.println(person.getId()+"\t"+person.getName()+"\t"+person.getEmail());
				System.out.println("Aadhar Details");
				System.out.println(person.getAadhar().getId());
				System.out.println(person.getAadhar().getAadharNumber());
				System.out.println(person.getAadhar().getAddress());
			}
	}
}
}
}