package com.codingchallenge.codingchallenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingchallenge.codingchallenge.enums.AccountType;
import com.codingchallenge.codingchallenge.exception.InvalidIdException;
import com.codingchallenge.codingchallenge.model.AccountHolder;
import com.codingchallenge.codingchallenge.repository.AccountHolderRepository;


@Service
public class AccountHolderService {
	
	@Autowired
	private AccountHolderRepository accountHolderRepository;

	public AccountHolder postaccountholder(AccountHolder accountHolder) {
		return accountHolderRepository.save(accountHolder);
	}

	public List<AccountHolder> getaccountholder(AccountType type) {
		
		return accountHolderRepository.findByAccountType(type);
	}

	public AccountHolder getaccountholder(int eid) throws InvalidIdException {
		Optional<AccountHolder> optional=accountHolderRepository.findById(eid);
		if(!optional.isPresent())
			throw new InvalidIdException("Executive id Invalid");
		return optional.get();
	}
	}


