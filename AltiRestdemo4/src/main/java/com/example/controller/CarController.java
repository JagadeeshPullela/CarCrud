package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Car;
import com.example.service1.CarService;

@RestController
public class CarController {
	@Autowired
	private CarService carService;
	
	@RequestMapping(value="/car/saveCar",method=RequestMethod.POST)
	public Object saveCar(@RequestBody Car car)
	{
		return(carService.SaveCar(car));
	}
	@RequestMapping(value="/car/getCar",method=RequestMethod.GET)
	public List<Car> getAllCar()
	{
		return(carService.getAllCars());
	}
	@RequestMapping(value="/car/getCarById/{id}",method=RequestMethod.GET)
	public Car getAllCarById(@PathVariable int id)
	{
		return(carService.getCarInfoById(id));
	}
	@RequestMapping(value = "/car/updateCar",method = RequestMethod.PUT)
	public Object updateCarData(@RequestBody Car car)
	{
	return(carService.updateCarInfo(car));
	}

	@RequestMapping(value = "/car/deleteCar/{id}",method = RequestMethod.DELETE)
	public Object deleteCarData(@PathVariable int id)
	{
	return(carService.deleteCarInfo(id));
	}
}
