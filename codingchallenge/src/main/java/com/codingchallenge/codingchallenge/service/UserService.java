package com.codingchallenge.codingchallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingchallenge.codingchallenge.model.User;
import com.codingchallenge.codingchallenge.repository.UserRepository;



@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User insert(User user) {
		return userRepository.save(user);
	}

	public void save(User user) {
		userRepository.save(user);
		
	}
}
