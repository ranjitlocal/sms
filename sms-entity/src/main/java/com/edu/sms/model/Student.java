/**
 * 
 */
package com.edu.sms.model;

import java.util.Date;

/**
 * @author ranjit.soni
 *
 */
public class Student {

	private String studentName;
	private Date dob;
	private Long mobile;
	private Address address;

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString()
	{
		return String.format("%s", studentName);
	}
	
}
