package com.chaya.address;

public class Customer
{
int customerId;
String customerName;
long customerContact;
Address address;

public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public long getCustomerContact() {
	return customerContact;
}
public void setCustomerContact(long customerContact) {
	this.customerContact = customerContact;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public void display()
{
	System.out.println( getCustomerContact()+ getCustomerId() +getCustomerName() + getAddress());
}
}
