package com.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int b_id;
  private String b_title;
  private double b_price;
  
public Book()
{
	super();
}

public Book(int b_id, String b_title, double b_price) {
	super();
	this.b_id = b_id;
	this.b_title = b_title;
	this.b_price = b_price;
}

public int getB_id() {
	return b_id;
}

public void setB_id(int b_id) {
	this.b_id = b_id;
}

public String getB_title() {
	return b_title;
}

public void setB_title(String b_title) {
	this.b_title = b_title;
}

public double getB_price() {
	return b_price;
}

public void setB_price(double b_price) {
	this.b_price = b_price;
}

  
  
}
