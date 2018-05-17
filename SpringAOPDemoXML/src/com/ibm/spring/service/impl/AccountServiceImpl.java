package com.ibm.spring.service.impl;

import com.ibm.spring.pojo.Account;

public class AccountServiceImpl {
	public void updateAccountBalance(Account account, Long amount)
	{
		System.out.println("Account Number"+account.getAccountNumber() +",Amount" +amount);
	}

}
