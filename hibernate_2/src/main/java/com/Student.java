package com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	private int studentRoll;
	private String studentName;
	private int age;
	@ManyToOne
	private College college;
	
	
	public int getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", age=" + age + ", college="
				+ college + "]";
	}
	public Student(int studentRoll, String studentName, int age, College college) {
		super();
		this.studentRoll = studentRoll;
		this.studentName = studentName;
		this.age = age;
		this.college = college;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
