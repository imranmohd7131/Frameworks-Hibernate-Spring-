package com.spring;

public class University {
	
	private String uniName;

	public String getUniName() {
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}

	public University(String uniName) {
		super();
		this.uniName = uniName;
	}

	public University() {
		
	}

	@Override
	public String toString() {
		return "University [uniName=" + uniName + "]";
	}
	
	
}
