package com.chaya.bankacc;

public interface BankAccountRepository 
{
	public double getBalance(long accountId);
	
	public double updateBalance(long accountId, double newBalance, String option);
		
}
