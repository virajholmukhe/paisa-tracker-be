package com.pt.paisatracker.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.pt.paisatracker.dto.UserDTO;

import lombok.Data;

@RestController
@CrossOrigin
@Validated
@Data
public class UserController {

	public UserDTO getUser(String userName) {
		return null;
	}

	public String registerUser(UserDTO userDTO) {
		return null;
	}

	public UserDTO updateUser(UserDTO userDTO) {
		return null;
	}

	public String deleteUser(String userName) {
		return null;
	}
}
