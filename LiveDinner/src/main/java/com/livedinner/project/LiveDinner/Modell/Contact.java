package com.livedinner.project.LiveDinner.Modell;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
	private String name;
	@Id
	private String email;
	private String message;
	private String person;
	public Contact() {
	}
	public Contact(String name, String email, String message, String person) {
		this.name = name;
		this.email = email;
		this.message = message;
		this.person = person;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", message=" + message + ", person=" + person + "]";
	}
	
	



}
