package com.vikash.java.tech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vikash.java.tech.entity.Contact;

public interface ContactService {
		public List<Contact> getContactsOfUser(Long userId);
	}


