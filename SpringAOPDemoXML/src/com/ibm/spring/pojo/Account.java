package com.ibm.spring.pojo;

public class Account {
	private int accountNumber;
	private String accountMessage;
	
	public Account(int accountNumber, String accountMessage) {
		super();
		this.accountNumber = accountNumber;
		this.accountMessage = accountMessage;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountMessage() {
		return accountMessage;
	}
	public void setAccountMessage(String accountMessage) {
		this.accountMessage = accountMessage;
	}

}
