
package org.alvas.many_to_many.dto;



import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;





@Entity
public class Feature {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int FeatureId;
@CreationTimestamp
private LocalDateTime dateTime;
private String featureName;

@ManyToMany
@JoinTable(name="cars_and_features", joinColumns=@JoinColumn(name="cars_id"),inverseJoinColumns=@JoinColumn(name="feature_id"))
List<Car> cars;

public int getFeatureId() {
	return FeatureId;
}

public void setFeatureId(int featureId) {
	FeatureId = featureId;
}

public LocalDateTime getDateTime() {
	return dateTime;
}

public void setDateTime(LocalDateTime dateTime) {
	this.dateTime = dateTime;
}

public String getFeatureName() {
	return featureName;
}

public void setFeatureName(String featureName) {
	this.featureName = featureName;
}

public List<Car> getCars() {
	return cars;
}

public void setCars(List<Car> cars) {
	this.cars = cars;
}




}
