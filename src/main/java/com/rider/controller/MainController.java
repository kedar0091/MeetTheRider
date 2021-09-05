package com.rider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rider.entities.User;
import com.rider.service.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/register")
	public String register(Model model){
		
		User user = new User();
		
		model.addAttribute("user", user);
		return "registration";
	}
	
	@PostMapping("/registration")
	public String adduser(@ModelAttribute("user") User user,Model model)
	{
		this.userService.insertUser(user);
		model.addAttribute("user", user);
		return "redirect:/";
	}
	
	@GetMapping("/signin")
	public String signin(Model model)
	{
		return "login";
	}
	
	
	
	
}
