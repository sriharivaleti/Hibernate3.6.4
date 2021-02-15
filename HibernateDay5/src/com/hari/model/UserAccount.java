package com.hari.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name = "User_Account")
public class UserAccount {
	
	@Id @GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "UserID")
	private int userAccountId;
	
	@Column(name = "userAccountName")
	private String userName;
	@Column(name = "loginPassword")
	private String password;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String designation;
	
	public int getUserAccountId() {
		return userAccountId;
	}
	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password + " From get method";
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "UserAccount [userAccountId=" + userAccountId + ", userName=" + userName + ", password=" + password
				+ ", designation=" + designation + "]";
	}
	
	
	
	}
	
	
	


