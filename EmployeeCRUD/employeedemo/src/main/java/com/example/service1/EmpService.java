package com.example.service1;

import java.util.List;

import com.example.model.Employee;

public interface EmpService {
	public Object SaveEmp(Employee emp);
	public List<Employee> getAllEmps();
	public Employee getEmpInfoById(int id);
	public Object updateEmpInfo(Employee emp);
	public Object deleteEmpInfo(int id);
}
