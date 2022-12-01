package com.spring_project;

public class Bank {
	private String bankName;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + "]";
	}

	public Bank(String bankName) {
		super();
		this.bankName = bankName;
	}
	public Bank() {
		super();
	}
	
}
