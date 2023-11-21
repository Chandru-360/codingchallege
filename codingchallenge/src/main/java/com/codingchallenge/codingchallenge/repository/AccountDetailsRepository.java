package com.codingchallenge.codingchallenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.codingchallenge.codingchallenge.model.AccountDetails;
import com.codingchallenge.codingchallenge.model.AccountHolder;

public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Integer>{

	@Query("SELECT ad.accountHolder FROM AccountDetails ad WHERE ad.bankExecutive.id =?1")
	List<AccountHolder> findAccountHoldersByExecutiveId(int eid);

}
