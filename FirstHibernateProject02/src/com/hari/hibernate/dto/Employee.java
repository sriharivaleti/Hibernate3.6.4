package com.hari.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "EMPLOYEE_NEW")
public class Employee {

	@Id
	@Column(name ="EMPID")
	private int employeeid;
	@Column(name ="DESIGNATION")
	private String designation;
	@Column(name ="EMPNAME")
	private String employeeName;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", designation=" + designation + ", employeeName=" + employeeName
				+ "]";
	}
	
	
	
	
}
