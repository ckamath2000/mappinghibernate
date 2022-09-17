package org.alvas.one_to_many.controller;



import java.util.Arrays;
import java.util.List;

import org.alvas.one_to_many.dao.TeacherDao;
import org.alvas.one_to_many.dto.Teacher;
import org.alvas.one_to_many.dto.Subject;

public class TeacherController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherDao teacherDao=new TeacherDao();
	Teacher teacher=new Teacher();

	teacher.setTeacherName("Roy");
	teacher.setTeacherEmail("Roy123@gmail.com");
	
Subject subject1=new Subject();
Subject subject2=new Subject();
subject1.setName("Java");
subject1.setAuthor("gosling");
subject1.setTeacher(teacher);
subject2.setName("computer");
subject2.setAuthor("charles");
subject2.setTeacher(teacher);
List<Subject> list=Arrays.asList(subject1,subject2);
teacherDao.saveTeacherSubject(teacher,list);
}

}