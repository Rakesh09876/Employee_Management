package com.test.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
 
	 @Autowired
	   private EmployeeService service;
	   
	   @PostMapping("/addEmployee")
	   private String addEmployee(@RequestBody Employee employee) {
	   return service.saveEmployee(employee);
	   }
	   public List<Employee> addEmployees(List<Employee> employees){
		   return service.saveEmployees(employees);
	   }
	   
	   @GetMapping("/employees")
	   public List<Employee> findAllEmployees(){
		   return service.getEmployees();
	   }
	   @GetMapping("/employees/{id}")
	   public Employee findEmployeeById(@PathVariable int id) {
		   return service.getEmployeeById(id);
	   }
	  @PutMapping("/update")
	  public Employee updateEmployee(@RequestBody Employee employee) {
		  return service.updateEmployee(employee);
	  }
	  
	   
}
