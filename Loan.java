package com.demo;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Loan
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@ManyToOne
@JoinColumn(name = "book_id")
 private Book book;

@ManyToOne
@JoinColumn(name = "user_id")
private User user;

private String loandate;
private String returndate;

public Loan()
{
	super();
}
public Loan(int id, Book book, User user,  String loandate, String returndate) {
	super();
	this.id = id;
	this.book = book;
	this.user = user;
	this.loandate = loandate;
	this.returndate = returndate;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public String getLoandate() {
	return loandate;
}
public void setLoandate(String loandate) {
	this.loandate = loandate;
}
public String getReturndate() {
	return returndate;
}
public void setReturndate(String returndate) {
	this.returndate = returndate;
}


}

