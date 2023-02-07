package com.profiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profiles.entity.User;

@Repository
public interface  UserRepo extends JpaRepository<User, Integer> {
 
	
}
