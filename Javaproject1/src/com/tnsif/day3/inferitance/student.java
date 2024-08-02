package com.tnsif.day3.inferitance;

public class student {
String name;
int idno;
String address;
int mobileno;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getIdno() {
	return idno;
}
public void setIdno(int idno) {
	this.idno = idno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getMobileno() {
	return mobileno;
}
public void setMobileno(int mobileno) {
	this.mobileno = mobileno;
}
@Override
public String toString() {
	return "student [name=" + name + ", idno=" + idno + ", address=" + address + ", mobileno=" + mobileno + "]";
}




}
 
