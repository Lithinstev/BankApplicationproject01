package com.nt.service;

public class Bankingoperation implements FunctionalComp{

	@Override
	public double withdrawal(double Amount)
	{
		double  current_balance = 2000.00;
		if(Amount <= 0)
			 throw new IllegalArgumentException("Widhdrawal amount should be in postive");
		else if(Amount >= current_balance) 
			throw new IllegalArgumentException("Widhdrawal amount should be less than or equal to current_balance");
		else 
		  (current_balance - Amount);			
	
		return  current_balance;
	}

	@Override
	public double Deposit(double Amount) 
	{
		
		return 0;
	}

}
