package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicles")
public class Vehicle {
	
	@Id
	private long vehicleId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "loanId")
	private Loan loan;
	
	private String manufacturer;
	private String vehicleType;
	private String model;
	private long exShowroomPrice;
	private long onRoadPrice;
	
	public long getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getExShowroomPrice() {
		return exShowroomPrice;
	}
	public void setExShowroomPrice(long exShowroomPrice) {
		this.exShowroomPrice = exShowroomPrice;
	}
	public long getOnRoadPrice() {
		return onRoadPrice;
	}
	public void setOnRoadPrice(long onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}
	
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", user=" + user + ", loan=" + loan + ", manufacturer="
				+ manufacturer + ", vehicleType=" + vehicleType + ", model=" + model + ", exShowroomPrice="
				+ exShowroomPrice + ", onRoadPrice=" + onRoadPrice + "]";
	}
	
}
