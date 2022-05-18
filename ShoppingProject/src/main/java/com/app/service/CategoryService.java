package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.CategoryRepo;
import com.app.model.*;
import java.util.List;
//import java.util.Locale.Category;

@Service
@Transactional
public class CategoryService {
	
	@Autowired
	CategoryRepo cr;
	
	public List<Category> catlist()
	{
		return cr.findAll();
	}
	

}
