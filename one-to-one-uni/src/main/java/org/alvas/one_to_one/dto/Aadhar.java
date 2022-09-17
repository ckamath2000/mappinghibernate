package org.alvas.one_to_one.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aadhar {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private long aadharNumber;
private String Address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getAadharNumber() {
	return aadharNumber;
}
public void setAadharNumber(long aadharNumber) {
	this.aadharNumber = aadharNumber;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}

}
