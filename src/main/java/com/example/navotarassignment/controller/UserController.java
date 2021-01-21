package com.example.navotarassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.navotarassignment.model.User;
import com.example.navotarassignment.service.LoginService;

@RestController
public class UserController {

	@Autowired
	private LoginService service;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
	}
//	
//	@RequestMapping(value = "/getuserbyid/{id}", method = RequestMethod.GET)
//	public User findUserById(@PathVariable int id) {
//		return service.getUserById(id);
//	}
	
	@RequestMapping(value = "/getuserbyname/{name}", method = RequestMethod.GET)
	public User findUserById(@PathVariable String name) {
		return service.getUserByName(name);
	}
	
//	@RequestMapping(value = "/getuserbyname/{name}", method = RequestMethod.PUT)
//	public User findUserById(@PathVariable String name) {
//		return service.getUserByName(name);
//	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
}
