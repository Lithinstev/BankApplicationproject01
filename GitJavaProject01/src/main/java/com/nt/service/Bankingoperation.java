package com.nt.service;

public class Bankingoperation implements FunctionalComp{
	double  current_balance = 2000.00;

	@Override
	public double withdrawal(double Amount)
	{
		if(Amount <= 0)
			 throw new IllegalArgumentException("Widhdrawal amount should be in postive");
		else if(Amount >= current_balance) 
			throw new IllegalArgumentException("Widhdrawal amount should be less than or equal to current_balance");
		else 
		  current_balance -= Amount;			
	
		return  current_balance;
	}

	@Override
	public double Deposit(double Amount) 
	{
		current_balance=current_balance+Amount;
		System.out.println("Deposit Successful");
		return current_balance;
	}

}
