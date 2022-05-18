package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Admin;
//import com.app.model.Admin;
import com.app.model.Category;
import com.app.repository.AdminRepo;
import com.app.repository.CategoryRepo;

//import com.app.repository.CategoryRepo;
//import com.app.service.AdminService;
import java.util.*;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class AdminController {
	
	@Autowired
    private AdminRepo adminRepo;

    @GetMapping("/admin")
    public List<Admin> getAlladmin() {
        return adminRepo.findAll();
    }

    
    @PostMapping("/admin")
    public Admin createAdmin(@Valid @RequestBody Admin admin) {
        return adminRepo.save(admin);
    }

}
