package com.customer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.dto.LoginDto;

@RestController
public class LoginController {

	@PostMapping("/users/login")
	public ResponseEntity<String> login(@RequestBody LoginDto loginDto){
		return new ResponseEntity<>("Processing", HttpStatus.OK);
	}

}
