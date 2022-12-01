package com.spring;

public class College {
	private String collegeName;
	private int numOfStd;
	private University university;
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getNumOfStd() {
		return numOfStd;
	}
	public void setNumOfStd(int numOfStd) {
		this.numOfStd = numOfStd;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", numOfStd=" + numOfStd + ", university=" + university + "]";
	}
	public College(String collegeName, int numOfStd, University university) {
		super();
		this.collegeName = collegeName;
		this.numOfStd = numOfStd;
		this.university = university;
	}
	public College() {
		
	}
		
}
