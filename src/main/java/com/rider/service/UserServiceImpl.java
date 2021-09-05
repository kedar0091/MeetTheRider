package com.rider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rider.entities.User;
import com.rider.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository UserRepository;
	
	@Autowired
	BCryptPasswordEncoder PasswordEncoder;
	
	@Override
	public void insertUser(User user) {
		user.setRole("User");
		user.setStatus(false);
		user.setUserPassword(PasswordEncoder.encode(user.getUserPassword()));
		this.UserRepository.save(user);
	}

}
