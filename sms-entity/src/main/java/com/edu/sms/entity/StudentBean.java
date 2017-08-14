/**
 * 
 */
package com.edu.sms.entity;

import java.util.Date;

/**
 * @author ranjit.soni
 *
 */
public class StudentBean {
	
	private String studentName;
	private Date dob;
	private Long mobile;
	private AddressBean address;

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
	public AddressBean getAddress() {
		return address;
	}
	public void setAddress(AddressBean address) {
		this.address = address;
	}
	
	public String toString()
	{
		return String.format("%s", studentName);
	}
}
