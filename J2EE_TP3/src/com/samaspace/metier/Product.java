package com.samaspace.metier;

import java.io.Serializable;


public class Product implements Serializable{
	
	
	private Long product_id;
	private String product_name;
	private double product_price;
	
	
	public Product() {
		super();
	}
	
	public Product(String product_name, double product_price) {
		super();
		this.product_name = product_name;
		this.product_price = product_price;
	}
	
	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	

	
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	
	
	
	
	

}
