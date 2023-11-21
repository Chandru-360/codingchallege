package com.codingchallenge.codingchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingchallenge.codingchallenge.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
