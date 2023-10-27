package com.codingdojo.loginandregistration.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Size(min= 3, message="username must has at least 3 char!")
	private String username;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	@Size(min= 8, message="passwrod must longer than 8!")
	private String password;
	
	@Transient
	@NotEmpty
	private String confirmpassword;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern ="yyy-MM-dd-hh-m")
	private Date CreatedAt;
	
	@DateTimeFormat(pattern ="yyy-MM-dd-hh-m")
	private Date UpdatedAt;
	
	public User() {
		
	}
	
	@PrePersist
	protected void onCreate() {
		this.CreatedAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.UpdatedAt = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public Date getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(Date createdAt) {
		CreatedAt = createdAt;
	}

	public Date getUpdatedAt() {
		return UpdatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		UpdatedAt = updatedAt;
	}
	
	
}
