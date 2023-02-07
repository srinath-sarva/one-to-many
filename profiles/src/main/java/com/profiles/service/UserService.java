package com.profiles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profiles.entity.User;
import com.profiles.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;

	public List<User> getAll() {
		// TODO Auto-generated method stu
		return repo.findAll();
	}

	public User save(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
		
	}
	
	

}
