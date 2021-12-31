package com.example.service1;

import java.util.List;

import com.example.model.Car;

public interface CarService {
	public Object SaveCar(Car car);
	public List<Car> getAllCars();
	public Car getCarInfoById(int id);
	public Car UpdateCar(String str);
	public Object updateCarInfo(Car car);
	public Object deleteCarInfo(int id);
}
