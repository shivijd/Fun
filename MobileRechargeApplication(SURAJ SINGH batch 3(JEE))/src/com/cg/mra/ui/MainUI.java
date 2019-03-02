package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.InvalidMobileNumberException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI {
	public static void main(String[] args) throws InvalidMobileNumberException 
	{
		AccountService accountservice = new AccountServiceImpl();           
		Scanner scanner = new Scanner(System.in);							

		while (true)							//Infinite loop to show menu 
		{	
			System.out.println("1. To get account details");
			System.out.println("2. To get recharge amount");
			System.out.println("3. exit");

			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			switch (choice) 					//Switch case to choose options
			{
			case 1:
				System.out.println("Enter mobile number");
				String mobileno = scanner.next();
				boolean check = true;
				while (check) 					//While loop to validate mobile no
				{
					if (mobileno.length() == 10) {
						check = false;
					} else {
						System.err.println("Enter Valid Mobile Number");
						mobileno = scanner.next();
					}
				}

				try 							//try catch block to handle InvalidMobileNumberException
				{
					Account account2 = accountservice.getAccountDetails(mobileno);
					System.out.println("Your Current Balance is Rs " + account2.getAccountBalance());
				} catch (InvalidMobileNumberException e) {
					System.err.println("ERROR: Given Account Id Does Not Exists");
				}
				break;
			case 2:
				System.out.println("Enter mobile number");
				String mobno = scanner.next();

				boolean checkMobileNumber = true;
				while (checkMobileNumber)			//While loop to validate mobile no 
				{
					if (mobno.length() == 10) 
					{
						checkMobileNumber = false;
					} 
					else 
					{
						System.err.println("Enter Valid Mobile Number");
						mobno = scanner.next();
					}
				}
				boolean checkAmount = true;

				System.out.println("Enter amount");
				double amount = scanner.nextDouble();

				while (checkAmount)				//While loop to validate amount 
				{
					if (amount > 0) 
					{
						checkAmount = false;
					}
					else 
					{
						System.err.println("Enter Valid Amount");
						amount = scanner.nextDouble();
					}
				}

				try									//try catch block to handle InvalidMobileNumberException 
				{
					accountservice.rechargeAccount(mobno, amount);
					System.out.println("Your Account Recharged Successfully");
					Account account3 = accountservice.getAccountDetails(mobno);
					System.out.println("Hello " + account3.getCustomerName() + ", Available Balance is "
							+ account3.getAccountBalance());
				} 
				catch (InvalidMobileNumberException ex) 
				{
					System.err.println("ERROR: Cannot Recharge Account as Given Mobile No Does Not Exists");
				}

				break;
			case 3:
				System.exit(0);
				break;
			}
			System.out.println(" ");
			System.out.println("exit successfully");

		}

	}

}
