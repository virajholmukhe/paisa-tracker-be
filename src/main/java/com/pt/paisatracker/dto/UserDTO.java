package com.pt.paisatracker.dto;

import java.util.List;

import com.pt.paisatracker.entity.UserEntity;

import lombok.Data;


@Data
public class UserDTO {

	private String userName;
	

	private String userPassword;
	

	private String firstName;
	

	private String lastName;
	

	private List<String> friendList;
	

	private String emailId;
	

	private String phoneNumber;
	
	public static UserEntity prepareEntity(UserDTO userDTO) {
		UserEntity userEntity = new UserEntity();
		userEntity.setUserName(userDTO.getUserName());
		userEntity.setUserPassword(userDTO.getUserPassword());
		userEntity.setFirstName(userDTO.getFirstName());
		userEntity.setLastName(userDTO.getLastName());
		userEntity.setFriendList(userDTO.getFriendList());
		userEntity.setEmailId(userDTO.getEmailId());
		userEntity.setPhoneNumber(userDTO.getPhoneNumber());
		return userEntity;
	}
	
	public static UserDTO prepareDTO(UserEntity userEntity) {
		UserDTO userDTO = new UserDTO();
		userDTO.setUserName(userEntity.getUserName());
		userDTO.setUserPassword(userEntity.getUserPassword());
		userDTO.setFirstName(userEntity.getFirstName());
		userDTO.setLastName(userEntity.getLastName());
		userDTO.setFriendList(userEntity.getFriendList());
		userDTO.setEmailId(userEntity.getEmailId());
		userDTO.setPhoneNumber(userEntity.getPhoneNumber());
		return userDTO;
	}
}
