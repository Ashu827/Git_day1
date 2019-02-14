package com.chaya.bankacc;

public class BankAccount 
{
int accountId;
String AccountHolderName;
String accountType;
float accountBalance;

public BankAccount(int accountId, String accountHolderName, String accountType,
		float accountBalance) {
	super();
	this.accountId = accountId;
	AccountHolderName = accountHolderName;
	this.accountType = accountType;
	this.accountBalance = accountBalance;
}
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public String getAccountHolderName() {
	return AccountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	AccountHolderName = accountHolderName;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public float getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(float accountBalance) {
	this.accountBalance = accountBalance;
}

}
