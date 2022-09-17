package org.alvas.many_to_many.controller;





import java.util.Arrays;
import java.util.List;

import org.alvas.many_to_many.dao.CarDao;
import org.alvas.many_to_many.dto.Car;
import org.alvas.many_to_many.dto.Feature;

public class CarController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarDao carDao=new CarDao();
		Car car1=new Car();
	Feature feature1=new Feature();
	Car car2=new Car();
	Feature feature2=new Feature();
	car1.setCarName("TESLA");
	car1.setCarPrice(1000000);
	car2.setCarName("KIA");
	car2.setCarPrice(70000000);
	List<Car> cars=Arrays.asList(car1,car2);
	feature1.setFeatureName("Automatic-drive");
	feature2.setFeatureName("Wi-Fi");
	feature1.setCars(cars);
	feature2.setCars(cars);
	List<Feature> features=Arrays.asList(feature1,feature2);
	
	car1.setFeatures(features);
	car2.setFeatures(features);
	carDao.saveCar(cars,features);
}

}