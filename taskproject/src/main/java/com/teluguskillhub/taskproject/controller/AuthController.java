package com.teluguskillhub.taskproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teluguskillhub.taskproject.entity.Users;
import com.teluguskillhub.taskproject.payload.UserDto;
import com.teluguskillhub.taskproject.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	@Autowired
	private UserService userService;
	
	//POST Store the user in DB
	@PostMapping("/register")
	public void createUser(@RequestBody UserDto userDto) {
		userService.createUser(userDto);
		
		
	}

}
