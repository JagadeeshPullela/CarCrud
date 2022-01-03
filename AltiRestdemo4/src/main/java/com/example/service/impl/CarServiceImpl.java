package com.example.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Car;
import com.example.repository.CarRepository;
import com.example.service1.CarService;

@Service
public class CarServiceImpl implements CarService{
	@Autowired
	private CarRepository carRepository;
	@Override
	@Transactional
	public Object SaveCar(Car car) {
		Map<String,Object> map=new HashMap<String, Object>();
		if(car.getCompanyName().isEmpty())
		{
			map.put("Status","Error");
			map.put("Msg","Please Enter the Company Name");
		}else if(car.getModel().isEmpty())
		{
			map.put("Status","Error");
			map.put("Msg","Please Enter the model Name");
		}else
		{
			carRepository.save(car);
			map.put("Status","200");
			map.put("Msg","Data Inserted Successfully");
		}
		return map;
	}
	@Override
	public List<Car> getAllCars() {
		return carRepository.findAll();
	}
	@Override
	public Car getCarInfoById(int id) {
		return carRepository.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Object updateCarInfo(Car car) {
	Map<String, Object> map=new HashMap<String, Object>();
	if(car.getCompanyName().isEmpty())
	{
	map.put("Status", "Error");
	map.put("Msg", "Please Entert the Compnay Name");
	}else if(car.getModel().isEmpty())
	{
	map.put("Status", "Error");
	map.put("Msg", "Please Entert the Model Name");
	}else
	{
	carRepository.saveAndFlush(car);
	map.put("Status", "200");
	map.put("Msg", "Data Update SuccessFully");
	}
	return map;
	}


	@Override
	@Transactional
	public Object deleteCarInfo(int id) {
	Map<String, Object> map=new HashMap<String, Object>();
	carRepository.deleteById(id);
	map.put("Status", "200");
	map.put("Msg", "Data Deleted SuccessFully");
	return map;
	}
	@Override
	public Car UpdateCar(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
