package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "applicants")
public class Applicant {
	
	@Id
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User user;
	
	private String name;
	private int age;
	private String gender;
	private String employment;
	private long existingEmi;
	private long salary;
	private long phoneNo;
	private String emailId;
	private long aadharNo;
	private String panNo;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmployment() {
		return employment;
	}
	public void setEmployment(String employment) {
		this.employment = employment;
	}
	public long getExistingEmi() {
		return existingEmi;
	}
	public void setExistingEmi(long existingEmi) {
		this.existingEmi = existingEmi;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	
	@Override
	public String toString() {
		return "Applicant [user=" + user + ", name=" + name + ", age=" + age + ", gender=" + gender + ", employment="
				+ employment + ", existingEmi=" + existingEmi + ", salary=" + salary + ", phoneNo=" + phoneNo
				+ ", emailId=" + emailId + ", aadharNo=" + aadharNo + ", panNo=" + panNo + "]";
	}

}
