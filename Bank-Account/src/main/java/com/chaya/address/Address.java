package com.chaya.address;

public class Address 
{
String Street;
String city;
String state;
int zip;
String country;

public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	Street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Address [Street=" + Street + ", city=" + city + ", state=" + state
			+ ", zip=" + zip + ", country=" + country + "]";
}

}
