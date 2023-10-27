package com.codingdojo.loginandregistration.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.loginandregistration.models.Login;
import com.codingdojo.loginandregistration.models.User;
import com.codingdojo.loginandregistration.repositories.UserRepository;


@Service
public class UserService {

	private final UserRepository userRepository;
	public UserService (UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User create(User user) {
		return userRepository.save(user);
	}
	
	public User findOneUser(String email) {
		Optional<User> user = userRepository.findByEmail(email);
		if (user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}
	
	public User registerValid(User registeruser, BindingResult result) {
		Optional<User> user = userRepository.findByEmail(registeruser.getEmail());
		if (user.isPresent()) {
			result.rejectValue("email", "registeruser.email.exist", "Account alread exist");
		}
		if (!(registeruser.getPassword().equals(registeruser.getConfirmpassword()))) {
			result.rejectValue("password", "registeruser.password.match", "Password not match");
		}
		if (result.hasErrors()) {
			return null;
		} else {
			String hashed = BCrypt.hashpw(registeruser.getPassword(), BCrypt.gensalt());
			registeruser.setPassword(hashed);
			return registeruser;
		}
	}
	
	public Login loginValid (Login loginuser, BindingResult result) {
		Optional<User> user = userRepository.findByEmail(loginuser.getEmail());
		if(!user.isPresent()) {
			result.rejectValue("email", "registeruser.email", "InVaild entery");
			return null;
		} 
		if (!BCrypt.checkpw(loginuser.getPassword(), user.get().getPassword())) {
			result.rejectValue("email", "loginuser.password.match", "InVaild entery");
		}
		if (result.hasErrors()) {
			return null;
		} else {
			return loginuser;
		}
	}
}
