package com.chaya.bankacc;

import java.util.ArrayList;

public class BankAccountepositoryImpl implements BankAccountRepository 
{
	
	BankAccDAO obj1 = new BankAccDAO();
	ArrayList<BankAccount> newArray = obj1.getUser();

	@Override
	public double getBalance(long accountId) {
		double bal = 45;
		for (BankAccount arr : newArray) {

			if (arr.getAccountId() == accountId) {
				bal = arr.getAccountBalance();
			}
		}
		return bal;
	}

	@Override
	public double updateBalance(long accountId, double newBalance,String option) 
	{ 
		
		double bal = 0;
		if(option.equals("withdraw"))
	
			{
			for (BankAccount arr : newArray) {

				if (arr.getAccountId() == accountId) {
					bal = arr.getAccountBalance()+newBalance;
			}
			}
			}
			else if(option.equals("deposit"))
				
			{
			for (BankAccount arr : newArray) {

				if (arr.getAccountId() == accountId) {
					bal = arr.getAccountBalance()-newBalance;
			}
			}
			}
		return bal;
	}
}
