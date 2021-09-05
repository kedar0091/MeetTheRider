package com.rider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rider.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}
