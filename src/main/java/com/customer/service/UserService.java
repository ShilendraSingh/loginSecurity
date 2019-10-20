package com.customer.service;

import com.customer.dto.ResponseDto;
import com.customer.dto.UserDto;

public interface UserService {

	public ResponseDto registerUser(UserDto userDto);

}
