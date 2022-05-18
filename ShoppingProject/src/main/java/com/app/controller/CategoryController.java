package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.CategoryService;
import com.app.model.*;
import com.app.repository.CategoryRepo;

import java.util.List;
//import java.util.Locale.Category;

import javax.validation.Valid;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class CategoryController {
	
	@Autowired
    private CategoryRepo categoryRepo;

    @GetMapping("/category")
    public List<Category> getAllcategory() {
        return categoryRepo.findAll();
    }

    
    @PostMapping("/category")
    public Category createCategory(@Valid @RequestBody Category category) {
        return categoryRepo.save(category);
    }
}
