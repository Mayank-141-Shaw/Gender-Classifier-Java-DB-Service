package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public User getUserById(long id) {
		return repo.findById(id).get();
	}
	
	public List<User> getAllUsers(){
		return repo.findAll();
	}
}
