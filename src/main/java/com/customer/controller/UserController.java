package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.dto.ResponseDto;
import com.customer.dto.UserDto;
import com.customer.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public ResponseEntity<ResponseDto> registerUser(@RequestBody UserDto userDto){
		
		return new ResponseEntity<>(userService.registerUser(userDto), HttpStatus.CREATED);
	}
}
