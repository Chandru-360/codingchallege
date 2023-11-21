package com.codingchallenge.codingchallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingchallenge.codingchallenge.model.AccountDetails;
import com.codingchallenge.codingchallenge.model.AccountHolder;
import com.codingchallenge.codingchallenge.repository.AccountDetailsRepository;

@Service
public class AccountDetailsService {
	
	@Autowired
	private AccountDetailsRepository accountDetailsRepository;

	public AccountDetails post(AccountDetails accountDetails) {
		// TODO Auto-generated method stub
		return accountDetailsRepository.save(accountDetails);
	}

	public List<AccountHolder> getAccountHoldersByExecutiveId(int eid) {
		// TODO Auto-generated method stub
		return accountDetailsRepository.findAccountHoldersByExecutiveId(eid);
	}
	

}
