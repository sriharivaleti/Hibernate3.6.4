package com.hari.modal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Column(name = "FlatName")
	private String address1;
	@Column(name = "StreetName")
	private String address2;
	@Column(name = "AreaName")
	private String address3;
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", address3=" + address3 + "]";
	}
	
	

}
