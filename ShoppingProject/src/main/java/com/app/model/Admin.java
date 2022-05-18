package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	
	
	int admin_id;
	String admin_name;
	String admin_password;
	String admin_email;
	int retail_id;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public int getRetail_id() {
		return retail_id;
	}
	public void setRetail_id(int retail_id) {
		this.retail_id = retail_id;
	}
	public Admin(int admin_id, String admin_name, String admin_password, String admin_email, int retail_id) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.admin_password = admin_password;
		this.admin_email = admin_email;
		this.retail_id = retail_id;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
