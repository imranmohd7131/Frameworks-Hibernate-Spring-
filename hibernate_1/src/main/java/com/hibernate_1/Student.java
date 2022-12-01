package com.hibernate_1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	@Override
	public String toString() {
		return "Student [age=" + age + ", roll=" + roll + ", name=" + name + "]";
	}
	private int age;
	@Id
	private int roll;
	//@Column(name="Username")
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Student()
	{}
	public Student(int age, int roll, String name) {
		super();
		this.age = age;
		this.roll = roll;
		this.name = name;
	}
}
