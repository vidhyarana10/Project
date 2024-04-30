package com.livedinner.project.LiveDinner.Modell;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reservation {
	
	private String name;
	@Id
	private String email;
	private String number;
	private String person;
	private String date;
	private String time;
	public Reservation() {
	}
	public Reservation(String name, String email, String number, String person, String date, String time) {
		this.name = name;
		this.email = email;
		this.number = number;
		this.person = person;
		this.date = date;
		this.time = time;
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Reservation [name=" + name + ", email=" + email + ", number=" + number + ", person=" + person
				+ ", date=" + date + ", time=" + time + "]";
	}
	
	
	
	

}
