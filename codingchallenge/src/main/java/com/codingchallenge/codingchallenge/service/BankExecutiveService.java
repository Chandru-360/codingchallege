package com.codingchallenge.codingchallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingchallenge.codingchallenge.model.BankExecutive;
import com.codingchallenge.codingchallenge.repository.BankExecutiveRepository;

@Service
public class BankExecutiveService {
	
	@Autowired
	private BankExecutiveRepository bankExecutiveRepository;

	public BankExecutive postexecutive(BankExecutive bankExecutive) {
		// TODO Auto-generated method stub
		return bankExecutiveRepository.save(bankExecutive);
	}
	
	

}
