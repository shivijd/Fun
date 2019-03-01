package com.mobile.service;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.mobile.beans.Customer;
import com.mobile.beans.Wallet;
import com.mobile.repo.WalletRepo;
import com.mobile.repo.WalletRepoImpl;

public class WalletServiceImpl implements WalletService {

	private WalletRepoImpl repo;

	public WalletServiceImpl(WalletRepoImpl repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Customer createAccount(String name, String mobileno, Wallet wallet) {
		Customer customer = new Customer(name, mobileno, wallet);
		if (repo.save(customer)) {
			return customer;
		}
		return null;
	}

	@Override
	public BigDecimal showBalance(String mobileno) 
	{
		return repo.findOne(mobileno).getWallet().getBalance();
	}

	@Override
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount) 
	{
		Customer sourceCustomer = withdrawAmount(sourceMobileNo, amount);
		Customer targetCustomer = depositAmount(targetMobileNo, amount);
		return targetCustomer;
	}

	@Override
	public Customer depositAmount(String mobileNo, BigDecimal amount) 
	{
		Customer customer=repo.findOne(mobileNo);
		customer.getWallet().setBalance(customer.getWallet().getBalance().add(amount));
		return customer;
	}

	@Override
	public Customer withdrawAmount(String mobileNo, BigDecimal amount) 
	{
		Customer customer1=repo.findOne(mobileNo);
		customer1.getWallet().setBalance(customer1.getWallet().getBalance().subtract(amount));

		return customer1;
	}

}
