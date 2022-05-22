package com.test.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	public String saveEmployee(Employee employee) {
		repository.save(employee);
		return "Employee added succssfully";
	}
	public List<Employee> saveEmployees(List<Employee> employees){
		return repository.saveAll(employees);
	}
	public List<Employee> getEmployees(){
		return repository.findAllByOrderByIdDesc();
	}
	public Employee getEmployeeById(int id) {
		return repository.findById(id).orElse(null);
	}
  public Employee updateEmployee(Employee employee) {
	  Employee existingEmployee = repository.findById(employee.getId()).orElse(null);
	  existingEmployee.setName(employee.getName());
	  existingEmployee.setDesignation(employee.getDesignation());
	  existingEmployee.setSalary(employee.getSalary());
	  return repository.save(existingEmployee);
  }
	
}
