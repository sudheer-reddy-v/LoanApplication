package com.application.loan.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.application.loan.model.LoanDetails;
import com.application.loan.model.LoanRepository;

public class LoanService {

	@Autowired
	LoanRepository loanRepo;
	
	public String getIntrestDetails(String salary) {
		return "10";
		
	}
	
	public LoanDetails saveLoanDetails(LoanDetails details) {
		
		loanRepo.save(details);
		return details;
	}
	
	public LoanDetails getLoanDetails(LoanDetails details) {
		
		loanRepo.findById(details.getLoanID());
		return details;
	}
	
}
