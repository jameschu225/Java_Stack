package com.codingdojo.loginandregistration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.loginandregistration.models.Login;
import com.codingdojo.loginandregistration.models.User;
import com.codingdojo.loginandregistration.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class LoginandRegisController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String main(@ModelAttribute("registeruser") User registeruser, 
			@ModelAttribute("loginuser") Login loginuser) {
		return "dashboard.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid@ModelAttribute("registeruser") User registeruser,
			BindingResult result, Model model, HttpSession session) {
//		User user = userService.findOneUser(registeruser.getEmail());
//		if (!(user==null)) {
//			result.rejectValue("email", "registeruser.email.exist", "Account alread exist");
//		} 
//		if (!(registeruser.getPassword().equals(registeruser.getConfirmpassword()))) {
//			result.rejectValue("password", "registeruser.password.match", "Password not match");
//		}
//		if (result.hasErrors()) {
//			model.addAttribute("loginuser", new Login());
//			return "dashboard.jsp";
//		} else {
//			String hashed = BCrypt.hashpw(registeruser.getPassword(), BCrypt.gensalt());
//			registeruser.setPassword(hashed);
//			userService.create(registeruser);
//			session.setAttribute("loginedUser", registeruser);
//			return "redirect:/welcome";			
//		}
		User validedRegisterUser = userService.registerValid(registeruser, result);
		if (validedRegisterUser==null) {
			model.addAttribute("loginuser", new Login());
			return "dashboard.jsp";
		} else {
			userService.create(registeruser);
			session.setAttribute("loginedUser", registeruser);
			return "redirect:/welcome";	
		}
	}
	
	@PostMapping("/login")
	public String login(@Valid@ModelAttribute("loginuser") Login loginuser,
			BindingResult result, Model model, HttpSession session) {
//		User user = userService.findOneUser(loginuser.getEmail());
//		if (user==null) {
//			result.rejectValue("email", "registeruser.email", "UnVaild entery");
//			model.addAttribute("registeruser", new User());
//			return "dashboard.jsp";
//		} else {
//			if (!BCrypt.checkpw(loginuser.getPassword(), user.getPassword())) {
//				result.rejectValue("email", "loginuser.password.match", "UnVaild password");
//			}
//			if (result.hasErrors()) {
//				model.addAttribute("registeruser", new User());
//				return "dashboard.jsp";
//			} 
//			else {
//				model.addAttribute(user);
//				session.setAttribute("loginedUser", user);
//				return "redirect:/welcome";
//			} 
//		}
		Login validLoginUser = userService.loginValid(loginuser, result);
		if (validLoginUser==null) {
			model.addAttribute("registeruser", new User());
			return "dashboard.jsp";
		} else {
			User user = userService.findOneUser(validLoginUser.getEmail());
			model.addAttribute(user);
			session.setAttribute("loginedUser", user);
			return "redirect:/welcome";
		}
	}
	
	@PostMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("loginedUser");
		return "redirect:/";
	}
	
	@GetMapping("/welcome")
	public String detailAccount(HttpSession session, Model model) {
		if (session.getAttribute("loginedUser")== null) {
			return "redirect:/";
		} else {
			model.addAttribute("loginedUser",session.getAttribute("loginedUser"));
			return "welcome.jsp";
		}
	}
}
