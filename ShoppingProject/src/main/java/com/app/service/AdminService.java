package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.AdminRepo;

@Service
@Transactional

public class AdminService {
	
	@Autowired
	AdminRepo adminRepo;
	

}
