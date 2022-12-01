package com.spring_project;

import org.springframework.beans.factory.annotation.Autowired;

public class Atm {
	private String atmName;
	private String atmLoc;
	@Autowired
	private Bank bank;
	
	public String getAtmName() {
		return atmName;
	}
	public void setAtmName(String atmName) {
		this.atmName = atmName;
	}
	public String getAtmLoc() {
		return atmLoc;
	}
	public void setAtmLoc(String atmLoc) {
		this.atmLoc = atmLoc;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Atm [atmName=" + atmName + ", atmLoc=" + atmLoc + ", bank=" + bank + "]";
	}
	public Atm(String atmName, String atmLoc, Bank bank) {
		super();
		this.atmName = atmName;
		this.atmLoc = atmLoc;
		this.bank = bank;
	}
	public Atm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
