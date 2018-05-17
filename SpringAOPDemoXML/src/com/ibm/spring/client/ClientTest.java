package com.ibm.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.spring.pojo.Account;
import com.ibm.spring.service.impl.AccountServiceImpl;

public class ClientTest {
	public static void main(String[] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		AccountServiceImpl accountService=ctx.getBean("accountService",AccountServiceImpl.class);
		accountService.updateAccountBalance(new Account(123,"SA"), 4000L);
	}

}
