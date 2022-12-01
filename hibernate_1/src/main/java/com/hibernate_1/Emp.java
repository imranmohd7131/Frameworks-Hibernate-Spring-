package com.hibernate_1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_info")
public class Emp {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String emp_name;
	private String designation;
	private double salary;
	public Emp() {
		
	}
	public Emp(int id, String emp_name, String designation, double salary) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", emp_name=" + emp_name + ", designation=" + designation + ", salary=" + salary
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
