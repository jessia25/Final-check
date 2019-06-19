package com.pack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="RATING", schema="ON_ROAD_ASSISTANCE")
public class Rating {

	@Column(name="mechanic_id")
	private Integer mechanicId;
	
	@Column(name="customer_id")
	private Integer customerId;
	
	@Column(name="rating")
	private Float rating;

	public Integer getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(Integer mechanicId) {
		this.mechanicId = mechanicId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}
	
}
