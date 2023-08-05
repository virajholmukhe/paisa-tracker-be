package com.pt.paisatracker.service;

import org.springframework.stereotype.Service;

import com.pt.paisatracker.dto.UserDTO;

@Service
public interface UserService {

	public UserDTO getUser(String userName);

	public String registerUser(UserDTO userDTO);

	public UserDTO updateUser(UserDTO userDTO);

	public String deleteUser(String userName);
}
