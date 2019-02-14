package com.chaya.bankacc;

import java.util.ArrayList;

public class BankAccDAO 
{
	ArrayList<BankAccount> array = new ArrayList();
	public BankAccDAO() 
	{
		
		array.add(new BankAccount(1, "priya", "savings", 10000));
		array.add(new BankAccount(2, "chaya", "savings", 10000));
		array.add(new BankAccount(3, "sunil", "savings", 10000));
	}

	public ArrayList<BankAccount> getUser()
	{
		return array;
	}
}
