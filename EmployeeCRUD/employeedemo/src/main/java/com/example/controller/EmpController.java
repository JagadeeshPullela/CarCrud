package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service1.EmpService;

@RestController
public class EmpController {
	@Autowired
	private EmpService empService;
	
	@RequestMapping(value="/emp/saveemp",method=RequestMethod.POST)
	public Object saveCar(@RequestBody Employee emp)
	{
		return(empService.SaveEmp(emp));
	}
	@RequestMapping(value="/emp/getemp",method=RequestMethod.GET)
	public List<Employee> getAllCar()
	{
		return(empService.getAllEmps());
	}
	@RequestMapping(value="/emp/getEmpById/{id}",method=RequestMethod.GET)
	public Employee getAllEmpById(@PathVariable int id)
	{
		return(empService.getEmpInfoById(id));
	}
	@RequestMapping(value = "/emp/updateEmp",method = RequestMethod.PUT)
	public Object updateEmpData(@RequestBody Employee emp)
	{
	return(empService.updateEmpInfo(emp));
	}

	@RequestMapping(value = "/emp/deleteEmp/{id}",method = RequestMethod.DELETE)
	public Object deleteCarData(@PathVariable int id)
	{
	return(empService.deleteEmpInfo(id));
	}
}
