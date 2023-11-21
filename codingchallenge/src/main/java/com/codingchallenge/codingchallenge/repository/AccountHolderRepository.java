package com.codingchallenge.codingchallenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.codingchallenge.codingchallenge.enums.AccountType;
import com.codingchallenge.codingchallenge.model.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder, Integer>{

	
	@Query("SELECT ad.accountHolder FROM AccountDetails ad WHERE ad.account.type =?1")
	List<AccountHolder> findByAccountType(AccountType type);

}
