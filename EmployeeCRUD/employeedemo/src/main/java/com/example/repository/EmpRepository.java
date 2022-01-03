package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.example.model.Employee;

@Component
public interface EmpRepository extends JpaRepository<Employee,Integer>{

}
