package com.codingchallenge.codingchallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingchallenge.codingchallenge.model.Account;
import com.codingchallenge.codingchallenge.model.AccountHolder;
import com.codingchallenge.codingchallenge.service.AccountHolderService;
import com.codingchallenge.codingchallenge.service.AccountService;

@RestController
public class AccountController {

	
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/postaccount")
	public Account postaccount(@RequestBody Account account) {
		return accountService.postaccountholder(account);
	}
	
	@PutMapping("/update")
	public Account update(@PathVariable("ahid")int ahid,@RequestBody Account account){
		
		return account;
		
	}
}
