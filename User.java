package com.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String uname;
	private String Address;
	private String email;
	private int no_of_book;
	
	public User()
	{
		super();
	}

	public User(int uid, String uname, String address, String email, int no_of_book) {
		super();
		this.uid = uid;
		this.uname = uname;
		Address = address;
		this.email = email;
		this.no_of_book = no_of_book;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNo_of_book() {
		return no_of_book;
	}

	public void setNo_of_book(int no_of_book) {
		this.no_of_book = no_of_book;
	}
	
	
	
}
