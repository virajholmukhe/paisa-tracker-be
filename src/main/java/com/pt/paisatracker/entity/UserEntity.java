package com.pt.paisatracker.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserEntity {

	@Id
	@Column(name = "userName")
	private String userName;
	
	@Column(name = "userPassword")
	private String userPassword;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "friendList")
	private List<String> friendList;
	
	@Column(name = "emailId")
	private String emailId;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
}
