package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exception.InvalidMobileNumberException;

public class AccountServiceImpl implements AccountService
{
	AccountDao accountdao=new AccountDaoImpl();				//Creating object of AccountDaoImpl class

	@Override
	public Account getAccountDetails(String mobileNo) throws InvalidMobileNumberException    	//Method to return account details to MainUI class on the basis of mob no entered
	{
		return accountdao.getAccountDetails(mobileNo);
	}

	@Override
	public double rechargeAccount(String mobileno, double rechargeAmount) throws InvalidMobileNumberException 		//Method to return updated account details to MainUI class on the basis of mob no entered
	{
		return accountdao.rechargeAccount(mobileno,rechargeAmount);
	}
	

}
