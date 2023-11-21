package com.codingchallenge.codingchallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingchallenge.codingchallenge.model.Account;
import com.codingchallenge.codingchallenge.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;

	public Account postaccountholder(Account account) {
		return accountRepository.save(account);
	}

}
