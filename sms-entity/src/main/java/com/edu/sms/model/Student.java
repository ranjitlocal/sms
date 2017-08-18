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
	private String address;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	public String toString()
	{
		return String.format("%s", studentName);
	}
	
}
