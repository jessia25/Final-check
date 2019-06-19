package com.pack.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "CUSTOMER_REQUEST", schema = "ON_ROAD_ASSISTANCE")
public class CustomerRequest {

	@Id
	@Column(name = "customer_id")
	private Integer customerId;

	@Column(name = "customer_name")
	@Size(min=2,max=50)
	private String customerName;

	@Column(name = "contact_number")
	
	private BigInteger contactNumber;

	@Column(name = "email")
	@Email
	private String email;

	@Column(name = "location")
	
	@Size(min=2,max=30)
	private String location;

	@Column(name = "latitude")
	private Double latitude;

	@Column(name = "longitude")
	private Double longitude;

	@Column(name = "status")
	
	private String status;

	@Column(name = "mechanic_id")
	private Integer mechanic_id;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getMechanic_id() {
		return mechanic_id;
	}

	public void setMechanic_id(Integer mechanic_id) {
		this.mechanic_id = mechanic_id;
	}
}
