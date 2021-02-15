package com.hari.modal;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "USERDETAILS")
public class UserDetails {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UserIdentity")
	private  int userid;
	@Column(name = "UserFullName")
	private String username;
	@Column(name = "ContactNumber")
	private String phonenumber;
	@Embedded
	private Address address;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserDetails [userid=" + userid + ", username=" + username + ", phonenumber=" + phonenumber
				+ ", address=" + address + "]";
	}

	
	
	
	
	
}
