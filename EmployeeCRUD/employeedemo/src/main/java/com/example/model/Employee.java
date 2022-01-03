package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="emptable")
public class Employee {
	@Id
	@SequenceGenerator(name="seq",initialValue=1, allocationSize=100)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	@Column(name="emp_id")
	private int empId;
	@Column(name="empName",length=30)
	private String empName;
	@Column(name="dept",length=30)
	private String dept;
	@Column(name="sal")
	private double sal;
	public int getEmpId() {
		return empId;
	}
	public void setCarId(int empId) {
		this.empId = empId;
	}
	public String getempName() {
		return empName;
	}
	public void setempName(String empName) {
		this.empName = empName;
	}
	public String getdept() {
		return dept;
	}
	public void setdept(String dept) {
		this.dept = dept;
	}
	public double getsal() {
		return sal;
	}
	public void setsal(double sal) {
		this.sal = sal;
	}
	
}

