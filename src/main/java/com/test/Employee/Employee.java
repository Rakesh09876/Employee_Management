package com.test.Employee;

import javax.persistence.Entity;

import javax.persistence.Id;



@Entity
public class Employee {

	@Id
	private int id;
	private String name;
	private String designation;
	private long salary;
	public Employee() {
		
	}
	public Employee(int id, String name, String designation, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
}