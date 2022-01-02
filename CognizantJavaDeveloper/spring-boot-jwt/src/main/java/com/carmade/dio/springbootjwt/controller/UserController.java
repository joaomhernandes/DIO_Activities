package com.carmade.dio.springbootjwt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carmade.dio.springbootjwt.data.UserData;
import com.carmade.dio.springbootjwt.service.UserDetailsServiceImpl;

@RestController
public class UserController {
	
	private final UserDetailsServiceImpl userDetailsService;
	
	public UserController(UserDetailsServiceImpl userDetailsService) {
		this.userDetailsService = userDetailsService;
	}
	
	@RequestMapping("/all-users")
	public List<UserData> listAllUsers(){
		return userDetailsService.listUsers();
	}

}
