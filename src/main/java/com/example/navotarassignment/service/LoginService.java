package com.example.navotarassignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.navotarassignment.model.User;
import com.example.navotarassignment.repository.UserRepository;

@Service
public class LoginService {
@Autowired
	private UserRepository repository;

public User saveUser(User user) {
	return repository.save(user);
}
//public String saveUser(User user) {
//	return "user saved";
//}
public User getUserById(int id) {
	return repository.findById(id).orElse(null);
}

public User getUserByName(String name) {
	return repository.findByName(name);
}

public String deleteUser(int id) {
	repository.deleteById(id);
	return "user removed" +id;
}

public User updateUser(User user) {
	User existingUser = repository.findById(user.getId()).orElse(null);
	existingUser.setName(user.getName());
	
	return repository.save(existingUser);
}
}
