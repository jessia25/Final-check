package com.pack.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="CUSTOMER" ,schema="ON_ROAD_ASSISTANCE")

public class Customer {
	
	@Column(name="customer_name")
	@NotEmpty
	private String customerName;
	
	@Id
	@Column(name="customer_id")
	private Integer customerId;
	
	@Column(name="password")
	@NotEmpty
	private String password;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	@Column(name="contact_number")
	private BigInteger contactNumber;
	
	@Column(name="email")
	@Email
	private String email;
	
	@Column(name="gender")
	@NotEmpty
	private String gender;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public BigInteger getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(BigInteger contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
