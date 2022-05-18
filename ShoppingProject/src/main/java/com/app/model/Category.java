package com.app.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Category {
	
	
	int category_id;
	String category_name;
	String category_type;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getCategory_type() {
		return category_type;
	}
	public void setCategory_type(String category_type) {
		this.category_type = category_type;
	}
	public Category(String category_name, String category_type) {
		super();
		this.category_name = category_name;
		this.category_type = category_type;
	}
	public Category() {
		super();
	}
	
	
	

}
