package org.alvas.many_to_many.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.alvas.many_to_many.dao.StudentDao;
import org.alvas.many_to_many.dto.Student;
import org.alvas.many_to_many.dto.Subject;

public class StudentSaveController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StudentDao studentDAO=new StudentDao();
		System.out.println("Enter the Number of Students");
		int stu=sc.nextInt();
		System.out.println("Enter the Number of Subjects");
		int sub=sc.nextInt();
		List<Student> slist=new ArrayList<Student>();
		List<Subject> sublist=new ArrayList<Subject>();
		for(int i=0;i<stu;i++) {
			Student student=new Student();
			System.out.println("Enter the Student Name");
			student.setStudentName(sc.next());
			System.out.println("Enter the Student Phone Number");
			student.setStudentPhone(sc.nextLong());
			for(int j=0;j<sub;j++) {
				Subject subjects=new Subject();
				System.out.println("Enter the Subject Name");
				subjects.setSubjectName(sc.next());
				System.out.println("Enter the Subject Author Name");
				subjects.setSubjectAuthor(sc.next());
				sublist.add(subjects);
			}
			student.setSubject(sublist);
			slist.add(student);
			
		}
		studentDAO.saveStudentSubject(slist, sublist);	
	}

}