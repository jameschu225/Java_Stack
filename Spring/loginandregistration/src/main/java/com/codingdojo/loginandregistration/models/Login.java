package com.codingdojo.loginandregistration.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Login {
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	@Size(min= 8, message="passwrod must longer than 8!")
	private String password;
	
	public Login() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
