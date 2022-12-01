package com;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {
	@Id
	private int collegeId;
	private String collegeName;
	private String location;
	@OneToMany(mappedBy ="college" , cascade=CascadeType.ALL)
	private List<Student> students;
	
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", location=" + location
				+ "]";
	}
	public College(int collegeId, String collegeName, String location, List<Student> students) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.location = location;
		this.students = students;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
