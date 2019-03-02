package com.cg.mra.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.InvalidMobileNumberException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class AccountTesting 
{
	
	AccountService accountServiceTest = new AccountServiceImpl();
	
	//When Valid Mobile Number Is Passed Show Account Details Successfully 
	@Test
	public void WhenValidMobileNumberIsPassedShowAccountDetailsSuccessfully() throws InvalidMobileNumberException
	{		
		accountServiceTest.getAccountDetails("9010210131");
		
	}
	
	//When Invalid Mobile Number Is Passed Throw Exception
	@Test(expected=com.cg.mra.exception.InvalidMobileNumberException.class)
	public void WhenInvalidMobileNumberIsPassedThrowException() throws InvalidMobileNumberException
	{		
		accountServiceTest.getAccountDetails("9999999999");
		
	}
	
	//When Valid Mobile Number Is Passed Recharge Account Successfully
	@Test
	public void WhenValidMobileNumberIsPassedRechargeAccountSuccessfully() throws InvalidMobileNumberException
	{		
		accountServiceTest.rechargeAccount("9010210131", 200);
		
	}
	
	//When Invalid Mobile Number Is Passed Recharge Is Not Successfull And Throw Exception
	@Test(expected=com.cg.mra.exception.InvalidMobileNumberException.class)
	public void WhenInvalidMobileNumberIsPassedRechargeIsNotSuccessfullAndThrowException() throws InvalidMobileNumberException
	{		
		accountServiceTest.rechargeAccount("5555555555", 200);
		
	}
	

}
