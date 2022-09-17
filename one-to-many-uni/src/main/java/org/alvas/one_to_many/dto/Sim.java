package org.alvas.one_to_many.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sim {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String provider;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProvider() {
	return provider;
}
public void setProvider(String provider) {
	this.provider = provider;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Sim [id=" + id + ", provider=" + provider + ", name=" + name + "]";
}


}
