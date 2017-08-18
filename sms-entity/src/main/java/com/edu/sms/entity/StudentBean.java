/**
 * 
 */
package com.edu.sms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ranjit.soni
 *
 */
@Entity
@Table(name="student")
public class StudentBean {
	
	private Long studentId;
	private String studentName;
	private Date dob;
	private Long mobile;
	private String address;
	
	public StudentBean(){
		super();
	}
	
	public StudentBean(Long studentId, String studentName, Date dob,
			Long mobile, String address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.dob = dob;
		this.mobile = mobile;
		this.address = address;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	
	@Column(name="studentName")
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Column(name="dob")
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Column(name="mobile")
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
	@Column(name="address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/*@Embedded
	@Column(name="address", nullable=true)
	@JoinColumn(name="addressId")
	public AddressBean getAddress() {
		return address;
	}
	public void setAddress(AddressBean address) {
		this.address = address;
	}
	*/
	@Override
	public String toString()
	{
		return "studentId :-"+studentId+", studentName :-"+studentName+", dob :-"+dob+", address :-"+address;
	}
}
