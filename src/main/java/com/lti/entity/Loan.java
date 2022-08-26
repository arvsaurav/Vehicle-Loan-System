package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "loan")
public class Loan {
	
	@Id
	private int loanId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User user;
	
	private String accountType;
	private long ammount;
	private int loanTenure;
	private int rateOfInterest;
	private long emi;
	private String loanStatus;
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getAmmount() {
		return ammount;
	}
	public void setAmmount(long ammount) {
		this.ammount = ammount;
	}
	public int getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}
	public int getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public long getEmi() {
		return emi;
	}
	public void setEmi(long emi) {
		this.emi = emi;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	
	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", user=" + user + ", accountType=" + accountType + ", ammount=" + ammount
				+ ", loanTenure=" + loanTenure + ", rateOfInterest=" + rateOfInterest + ", emi=" + emi + ", loanStatus="
				+ loanStatus + "]";
	}

}
