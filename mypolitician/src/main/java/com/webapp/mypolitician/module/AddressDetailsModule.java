package com.webapp.mypolitician.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address_details ")
public class AddressDetailsModule {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String addressLine;
	
	private String city;
	
	private String state;
	
	private int pincode;

	public AddressDetailsModule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressDetailsModule(int id, String addressLine, String city, String state, int pincode) {
		super();
		this.id = id;
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

}
