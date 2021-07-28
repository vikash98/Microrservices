package com.vikash.java.tech.service;

import org.springframework.stereotype.Service;

import com.vikash.java.tech.entity.User;

public interface UserService {
	public User getUser(Long id);
}
