package com.codingchallenge.codingchallenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingchallenge.codingchallenge.enums.AccountType;
import com.codingchallenge.codingchallenge.exception.InvalidIdException;
import com.codingchallenge.codingchallenge.model.AccountHolder;
import com.codingchallenge.codingchallenge.model.BankExecutive;
import com.codingchallenge.codingchallenge.service.AccountHolderService;

@RestController
public class AccountHolderController {
	
	@Autowired
	private AccountHolderService accountHolderService;
	
	@PostMapping("/post")
	public AccountHolder postaccountholder(@RequestBody AccountHolder accountHolder) {
		return accountHolderService.postaccountholder(accountHolder);
	}
	
	@GetMapping("all/{type}")
	public List<AccountHolder> getaccountholder(@PathVariable("type") AccountType type){
		return accountHolderService.getaccountholder(type);
	}
	

}



