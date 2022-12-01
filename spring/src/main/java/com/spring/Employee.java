package com.spring;

import java.util.Map;
import java.util.Set;

public class Employee {
	private String name;
	private double salary;
	private String designation;
	private Set<Long> phoneNo;
	private Map<Integer,String> location;
	
	public Map<Integer, String> getLocation() {
		return location;
	}
	public void setLocation(Map<Integer, String> location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Set<Long> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Set<Long> phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", designation=" + designation + ", phoneNo=" + phoneNo
				+ ", location=" + location + "]";
	}
	
	public Employee(String name, double salary, String designation, Set<Long> phoneNo, Map<Integer, String> location) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.phoneNo = phoneNo;
		this.location = location;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
