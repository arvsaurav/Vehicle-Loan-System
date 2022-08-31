package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "vehicles")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="v_seq")
	@SequenceGenerator(name="v_seq", initialValue = 3001, sequenceName = "v_seq", allocationSize = 1)
	private int vehicleId;
	
	private int userId;
	
	private String manufacturer;
	private String vehicleType;
	private String model;
	private long exShowroomPrice;
	private long onRoadPrice;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
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

}
