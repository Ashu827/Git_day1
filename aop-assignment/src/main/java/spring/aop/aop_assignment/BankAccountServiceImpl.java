package spring.aop.aop_assignment;

import spring.aop.bankinterface.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService{

	BankAccountepositoryImpl bankAccountRepositoryImpl=null;
	public BankAccountServiceImpl() {
		
	}

	public BankAccountServiceImpl(
			BankAccountepositoryImpl bankAccountRepositoryImpl) {
		super();
		this.bankAccountRepositoryImpl = bankAccountRepositoryImpl;
	}

	@Override
	public double withdraw(long accountId, double balance) {
	
		double newBalance=bankAccountRepositoryImpl.getBalance(accountId) - balance;
		return bankAccountRepositoryImpl.updateBalance(accountId, newBalance);
	}

	@Override
	public double deposit(long accountId, double balance) {
		double newBalance=bankAccountRepositoryImpl.getBalance(accountId) + balance;
		return bankAccountRepositoryImpl.updateBalance(accountId, newBalance);
		
	}

	@Override
	public double getBalance(long accountId) {
		
		return bankAccountRepositoryImpl.getBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		double account1=withdraw(fromAccount, amont);
		if(account1!=0){
			double account2=deposit(toAccount, amont);
			if(account2!=0){
				return true;
			}
			deposit(fromAccount, amont);
		}
		return false;
	}
}
