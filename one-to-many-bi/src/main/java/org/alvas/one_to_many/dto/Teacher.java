
package org.alvas.one_to_many.dto;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;





@Entity
public class Teacher {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int TeacherId;
private String TeacherName;
private String TeacherEmail;
@OneToMany(mappedBy="teacher")
List<Subject> subjects;
public int getTeacherId() {
	return TeacherId;
}
public void setTeacherId(int teacherId) {
	TeacherId = teacherId;
}
public String getTeacherName() {
	return TeacherName;
}
public void setTeacherName(String teacherName) {
	TeacherName = teacherName;
}
public String getTeacherEmail() {
	return TeacherEmail;
}
public void setTeacherEmail(String teacherEmail) {
	TeacherEmail = teacherEmail;
}
public List<Subject> getSubjects() {
	return subjects;
}
public void setSubjects(List<Subject> subjects) {
	this.subjects = subjects;
}



}
