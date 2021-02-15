package com.hari.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name ="USER_DETAILS")
public class UserDetails {
	
	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Column(name = "USER_NAME")
	private String userName;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column = @Column(name="HOME_STREET_NAME")),
		@AttributeOverride(name="city", column = @Column(name="HOME_CITY_NAME")),
		@AttributeOverride(name="pincode", column = @Column(name="HOME_PIN_CODE"))
		
	})
	private Address homeAddress;
	@Embedded
	private Address officeAddress;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", homeAddress=" + homeAddress
				+ ", officeAddress=" + officeAddress + "]";
	}
	
	

}
