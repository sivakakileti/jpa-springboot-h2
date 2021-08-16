package com.sb.start.employeeproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Address {
	
	@Id
	private Long addressId;
	private String streetName;
	private String pincode;
	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	@JsonBackReference
	private Employee employee;
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Address(Long addressId, String streetName, String pincode, Employee employee) {
		super();
		this.addressId = addressId;
		this.streetName = streetName;
		this.pincode = pincode;
		this.employee = employee;
	}
	
	public Address() {}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", streetName=" + streetName + ", pincode=" + pincode + ", employee="
				+ employee + "]";
	};
	
	
	
}
