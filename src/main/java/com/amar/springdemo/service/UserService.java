package com.amar.springdemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amar.springdemo.entity.User;
import com.amar.springdemo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public Optional<User> getUser(int userId) {
		return userRepository.findById(userId);
		
	}

	public void addUser(User user) {

		userRepository.save(user);
		
	}

