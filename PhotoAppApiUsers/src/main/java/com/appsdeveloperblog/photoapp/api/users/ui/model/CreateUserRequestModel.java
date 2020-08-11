package com.appsdeveloperblog.photoapp.api.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequestModel {

	@NotNull(message="First name cannot be null")
	@Size(min=2, message="First name must not be less than 2 characters")
	private String firstName;

	@NotNull(message="Last name cannot be null")
	@Size(min=2, message="Last name must not be less than 2 characters")
	private String lastName;
	
	@NotNull(message="Email cannot be null")
	@Email
	private String email;
	
	@NotNull(message="Password cannot be null")
	@Size(min=8, max=16, message="Password must be greater than 7 characters long")
	private String password;
	
}
