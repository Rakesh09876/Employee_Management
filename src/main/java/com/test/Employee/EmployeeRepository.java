package com.test.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
  

public List<Employee> findAllByOrderByIdDesc();
}
