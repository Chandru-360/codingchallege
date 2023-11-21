package com.codingchallenge.codingchallenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingchallenge.codingchallenge.enums.Role;
import com.codingchallenge.codingchallenge.exception.InvalidIdException;
import com.codingchallenge.codingchallenge.model.AccountHolder;
import com.codingchallenge.codingchallenge.model.BankExecutive;
import com.codingchallenge.codingchallenge.model.User;
import com.codingchallenge.codingchallenge.service.AccountDetailsService;
import com.codingchallenge.codingchallenge.service.BankExecutiveService;
import com.codingchallenge.codingchallenge.service.UserService;


@RestController
public class BankExecutiveController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BankExecutiveService bankExecutiveService;
	
	@Autowired
	private AccountDetailsService accountDetailsService;
	
	@PostMapping("/postexecutive")
	public BankExecutive postexecutive(@RequestBody BankExecutive bankExecutive) {
		
		User user=bankExecutive.getUser();
		String password=user.getPassword();
		
		user.setRole(Role.BANK_EXECUTIVE);
		userService.save(user);
		
		bankExecutive.setUser(user);
		return bankExecutiveService.postexecutive(bankExecutive);
	}
	
	@GetMapping("allaccountholder/{eid}")
	public ResponseEntity<?> getaccountholder(@PathVariable("eid") int eid){
		 List<AccountHolder> accountHolders = accountDetailsService.getAccountHoldersByExecutiveId(eid);
	        return new ResponseEntity.ok().body(accountHolders);
	}

}
