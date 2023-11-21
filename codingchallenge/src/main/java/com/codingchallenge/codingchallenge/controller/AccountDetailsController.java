package com.codingchallenge.codingchallenge.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingchallenge.codingchallenge.model.AccountDetails;
import com.codingchallenge.codingchallenge.service.AccountDetailsService;
import com.codingchallenge.codingchallenge.service.AccountHolderService;
import com.codingchallenge.codingchallenge.service.AccountService;
import com.codingchallenge.codingchallenge.service.BankExecutiveService;

@RestController
public class AccountDetailsController {
	
	@Autowired
	private AccountHolderService accountHolderService;
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private BankExecutiveService bankExecutiveService;
	
	@Autowired
	private AccountDetailsService accountDetailsService;
	
	
	@PostMapping("/accountdetails")
	public AccountDetails post(@RequestBody AccountDetails accountDetails) {
		
		accountDetails.setDateOfCreation(LocalDate.now());
		accountDetails.setAccount(accountDetails.getAccount());
		accountDetails.setAccountHolder(accountDetails.getAccountHolder());
		accountDetails.setBankExecutive(accountDetails.getBankExecutive());
		return accountDetailsService.post(accountDetails);
	}

}
