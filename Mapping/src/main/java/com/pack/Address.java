package com.pack;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address200")
public class Address {
	@Id
private int addressId;
private String place;
@OneToOne(targetEntity=Student.class,cascade=CascadeType.ALL)
@JoinColumn(name="stu_id",referencedColumnName="sid")
private Student student;
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
}
