package com.cg.mypaytmapp.service;

import java.math.BigDecimal;

import com.cg.mypaytmapp.beans.Customer;
import com.cg.mypaytmapp.exception.InsufficientBalanceException;
import com.cg.mypaytmapp.exception.InvalidInputException;

public interface WalletService {
	public Customer createAccount(String name ,String mobileno, BigDecimal amount)throws InvalidInputException,InsufficientBalanceException;
	public Customer showBalance (String mobileno)throws InvalidInputException,InsufficientBalanceException;
	public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, BigDecimal amount)throws InvalidInputException,InsufficientBalanceException;
	public Customer depositAmount (String mobileNo,BigDecimal amount )throws InvalidInputException,InsufficientBalanceException;
	public Customer withdrawAmount(String mobileNo, BigDecimal amount)throws InvalidInputException,InsufficientBalanceException;
	public void acceptCustomerDetails(Customer cust)throws InvalidInputException,InsufficientBalanceException;

}
