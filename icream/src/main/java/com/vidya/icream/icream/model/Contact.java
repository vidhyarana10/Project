package com.vidya.icream.icream.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
	
	private String name;
	@Id
	private String mobile;
	private String email;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String adress;
	public Contact(String name, String mobile, String email, String adress) {
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", mobile=" + mobile + ", email=" + email + ", adress=" + adress + "]";
	}
	
	
	

	

}
