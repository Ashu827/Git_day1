package com.chaya.bankacc;

public  class BankAccountServiceImpl implements BankAccountService
{
	 BankAccountepositoryImpl obj2 =new  BankAccountepositoryImpl();

	@Override
	public double withdraw(long accountId, double balance,String option) {
	
		return obj2.updateBalance(accountId, balance, option);
		
	}

	@Override
	public double deposit(long accountId, double balance, String option) {
		return obj2.updateBalance(accountId, balance, option);
	}

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public static void main(String[] args) 
	{
		 BankAccountepositoryImpl obj2 =new  BankAccountepositoryImpl();
			System.out.println(obj2.getBalance(1));
		BankAccountServiceImpl obj1= new BankAccountServiceImpl();
		System.out.println(obj1.withdraw(1, 500, "withdraw"));
		System.out.println(obj1.deposit(2, 300, "deposit"));
	
		
	}
}
