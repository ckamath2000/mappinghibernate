
package org.alvas.many_to_one.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class College {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int collegeid;
private String collegeName;
private String collegeAddress;
public int getCollegeid() {
	return collegeid;
}
public void setCollegeid(int collegeid) {
	this.collegeid = collegeid;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public String getCollegeAddress() {
	return collegeAddress;
}
public void setCollegeAddress(String collegeAddress) {
	this.collegeAddress = collegeAddress;
}



}
