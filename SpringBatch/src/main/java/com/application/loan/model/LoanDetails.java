package com.application.loan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class LoanDetails {
	
	@Id
	@GeneratedValue
	private String loanID;
	private String loanAmount;
	private String intrestRate;
	private String userName;
	public String getLoanID() {
		return loanID;
	}
	public void setLoanID(String loanID) {
		this.loanID = loanID;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getIntrestRate() {
		return intrestRate;
	}
	public void setIntrestRate(String intrestRate) {
		this.intrestRate = intrestRate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	

}
