package com.cg.mra.beans;

public class Account 
{
	private String accountType;
	private String customerName;
	private double accountBalance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String accountType, String customerName, double accountBalance)      	//Creating account constructor
	{
		super();
		this.accountType = accountType;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
	}
	
	/*
	 *Getter-Setter methods 
	*/
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	
	@Override
	public String toString()
	{
		return "Account[Account Type: "+accountType+" Customer Name: "+customerName+" Account Balance: "+accountBalance+"]";
	}
	
}