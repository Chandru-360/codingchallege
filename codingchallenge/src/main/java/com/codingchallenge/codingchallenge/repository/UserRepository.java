package com.codingchallenge.codingchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingchallenge.codingchallenge.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{



}
