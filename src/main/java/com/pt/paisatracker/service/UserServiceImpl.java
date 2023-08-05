package com.pt.paisatracker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pt.paisatracker.dto.UserDTO;
import com.pt.paisatracker.entity.UserEntity;
import com.pt.paisatracker.repository.UserRepository;

public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDTO getUser(String userName) {
		// TODO Auto-generated method stub
		Optional<UserEntity> userEntityOpt = userRepository.findById(userName);
		if(userEntityOpt.isPresent()) {
			return UserDTO.prepareDTO(userEntityOpt.get());
		}else {
			
			
		}
		return null;
	}

	@Override
	public String registerUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO updateUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
