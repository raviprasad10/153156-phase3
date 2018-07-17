package com.cg.mypaytmapp.repo;

import com.cg.mypaytmapp.beans.Customer;
import com.cg.mypaytmapp.exception.InsufficientBalanceException;
import com.cg.mypaytmapp.exception.InvalidInputException;

public interface WalletRepo {

	public boolean save(Customer customer)throws InvalidInputException,InsufficientBalanceException;

	public Customer findOne(String mobileNo)throws InvalidInputException,InsufficientBalanceException;
	public void update(Customer customer)throws InvalidInputException,InsufficientBalanceException;
	
}
