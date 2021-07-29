package com.amar.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amar.springdemo.entity.User;
import com.amar.springdemo.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService UserService;

	@RequestMapping("/User/{userId}")
	public User getUser(@PathVariable int userId) {

		return UserService.getUser(userId).get();

	}

	@RequestMapping(value = "/User", method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {

		UserService.addUser(user);

	}

}
