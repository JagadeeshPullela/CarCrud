package com.example.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmpRepository;
import com.example.service1.EmpService;

@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpRepository empRepository;
	@Override
	@Transactional
	public Object SaveEmp(Employee emp) {
		Map<String,Object> map=new HashMap<String, Object>();
		if(emp.getempName().isEmpty())
		{
			map.put("Status","Error");
			map.put("Msg","Please Enter the Employee Name");
		}else if(emp.getdept().isEmpty())
		{
			map.put("Status","Error");
			map.put("Msg","Please Enter the dept Name");
		}else
		{
			empRepository.save(emp);
			map.put("Status","200");
			map.put("Msg","Data Inserted Successfully");
		}
		return map;
	}
	@Override
	public List<Employee> getAllEmps() {
		return empRepository.findAll();
	}
	@Override
	public Employee getEmpInfoById(int id) {
		return empRepository.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Object updateEmpInfo(Employee emp) {
	Map<String, Object> map=new HashMap<String, Object>();
	if(emp.getempName().isEmpty())
	{
	map.put("Status", "Error");
	map.put("Msg", "Please Enter the Employee Name");
	}else if(emp.getdept().isEmpty())
	{
	map.put("Status", "Error");
	map.put("Msg", "Please Enter the Dept Name");
	}else
	{
	empRepository.saveAndFlush(emp);
	map.put("Status", "200");
	map.put("Msg", "Data Update SuccessFully");
	}
	return map;
	}


	@Override
	@Transactional
	public Object deleteEmpInfo(int id) {
	Map<String, Object> map=new HashMap<String, Object>();
	empRepository.deleteById(id);
	map.put("Status", "200");
	map.put("Msg", "Data Deleted SuccessFully");
	return map;
	}
	
}
